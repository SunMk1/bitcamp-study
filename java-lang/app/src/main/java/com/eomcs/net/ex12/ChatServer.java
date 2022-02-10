package com.eomcs.net.ex12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

@SuppressWarnings("rawtypes")
public class ChatServer {

  int port;
  ArrayList clientOutputStream = new ArrayList();

  public ChatServer(int port) {
    this.port = port;
  }

  public void service() {
    try (ServerSocket serverSocket = new ServerSocket(this.port)) {
      System.out.println("서버 실행 중...");

      while (true) {
        new RequestHandler(serverSocket.accept()).start();
      }
    } catch (Exception e) {
      System.out.println("서버 실행 오류 -" + e.getMessage());
    }
  }

  @SuppressWarnings("unchecked")
  public void sendMessage(String message) {
    ArrayList deleteStreams = new ArrayList();

    for (int i = 0; i < clientOutputStream.size(); i++) {
      DataOutputStream out = (DataOutputStream) clientOutputStream.get(i);
      try {
        out.writeUTF(message);
      } catch (Exception e) {
        System.out.println("전송오류" + message);
        deleteStreams.add(out);
      }
    }
    for (Object deleteStream : deleteStreams) {
      clientOutputStream.remove(deleteStream);
    }
  }

  class RequestHandler extends Thread {
    Socket socket;

    public RequestHandler(Socket socket) {
      this.socket = socket;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void run() {
      try(Socket socket2 = socket;
          DataOutputStream out = new DataOutputStream(socket.getOutputStream());
          DataInputStream in = new DataInputStream(socket.getInputStream())
          ) {

        clientOutputStream.add(out);

        String nickname = in.readUTF();

        out.writeUTF(nickname + "환영합니다");
        out.flush();

        while (true) {
          String message = in.readUTF();
          if (message.equals("\\quit")) {
            out.writeUTF("<[QUIT[]]>");
            out.flush();
            clientOutputStream.remove(out);
            break;
          }
          sendMessage(String.format("[%s] %s", nickname, message));
        }
      } catch (Exception e) {
        System.out.println("클라이언트와의 통신 오류!" + e.getMessage());
      }
    }
  }

  public static void main(String[] args) {
    new ChatServer(8888).service();
  }
}
