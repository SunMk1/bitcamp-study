package com.eomcs.app2.net;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import com.eomcs.app2.vo.Score;

public class ScoreTableProxy {

  Socket socket;
  ObjectInputStream in;
  ObjectOutputStream out;

  public ScoreTableProxy(String host, int port) throws Exception {
    socket = new Socket(host, port);
    in = new ObjectInputStream(socket.getInputStream());
    out = new ObjectOutputStream(socket.getOutputStream());
  }

  public void close() {
    try {
      out.writeUTF("quit");
      out.flush();
    } catch (Exception e) {

    } finally {
      try {out.close();} catch (Exception e) {}
      try {in.close();} catch (Exception e) {}
      try {socket.close();} catch (Exception e) {}
    }
  }

  public int insert(Score score) {
    try {
      out.writeUTF("insert");
      out.writeObject(score);
      out.flush();

      String status = in.readUTF();
      if (status.equals("success")) {
        return in.readInt();
      } else {
        throw new RuntimeException(in.readUTF());
      }
    } catch (Exception e) {
      throw new ScoreTableException(e);
    }
  }

  public Score[] seletList() {
    try {
      out.writeUTF("selectList");
      out.flush();

      String status = in.readUTF();
      if (status.equals("success")) {
        return (Score[]) in.readObject();
      } else {
        throw new RuntimeException(in.readUTF());
      }
    } catch (Exception e) {
      throw new ScoreTableException(e);
    }
  }

  public Score selectOne(int no) {
    try {
      out.writeUTF("seletOne");
      out.writeInt(no);
      out.flush();

      String status = in.readUTF();
      if (status.equals("success")) {
        return (Score) in.readObject();
      } else {
        throw new RuntimeException(in.readUTF());
      }
    } catch (Exception e) {
      throw new ScoreTableException(e);
    }
  }

  public int update(int no, Score score) {
    try {
      out.writeUTF("update");
      out.writeInt(no);
      out.writeObject(score);
      out.flush();

      String status = in.readUTF();
      if (status.equals("success")) {
        return in.readInt();
      } else {
        throw new RuntimeException(in.readUTF());
      }
    } catch (Exception e) {
      throw new ScoreTableException(e);
    }
  }

  public int delete(int no) {
    try {
      out.writeUTF("delete");
      out.writeInt(no);
      out.flush();

      String status = in.readUTF();
      if (status.equals("success")) {
        return in.readInt();
      } else {
        throw new RuntimeException(in.readUTF());
      }
    } catch (Exception e) {
      throw new ScoreTableException(e);
    }
  }
}
