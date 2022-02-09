package com.eomcs.net.ex11.test;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorSever {
  public static void main(String[] args) {
    try (ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("서버 실행 중...");

      while (true) {
        try (
            Socket socket = serverSocket.accept();
            Scanner in = new Scanner(socket.getInputStream());
            PrintStream out = new PrintStream(socket.getOutputStream());
            ) {

          out.println(".__                               ");
          out.println("__  _  __ ____ |  |   ____  ____   _____   ____  ");
          out.println("\\ \\/ \\/ // __ \\|  | _/ ___\\/  _ \\ /     \\_/ __ \\ ");
          out.println("\\     /\\  ___/|  |_\\  \\__(  <_> )  Y Y  \\  ___/ ");
          out.println("\\/\\_/  \\___  >____/\\___  >____/|__|_|  /\\___  >");
          out.println("\\/          \\/            \\/     \\/ ");

          out.println("계산식을 입력하세요");
          out.println("예) 23 + 7");
          out.println();

          String str = in.nextLine();
          out.println(str);
          out.flush();

        } catch (Exception e) {
          System.out.println("클라이언트 요청 처리 중 오류발생");
        }
      }

    } catch (Exception e) {
      System.out.println("서버 소켓 생성 중 오류발생");
    }
  }
}
