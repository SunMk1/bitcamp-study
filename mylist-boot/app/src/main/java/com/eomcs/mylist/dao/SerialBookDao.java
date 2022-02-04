package com.eomcs.mylist.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.eomcs.util.ArrayList;

//@Repository
public class SerialBookDao extends AbstractBookDao {
  String filename = "books.ser";

  public SerialBookDao() {
    try {
      ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filename)));

      bookList = (ArrayList) in.readObject();
      in.close();
    } catch (Exception e) {
      System.out.println("데이터 로딩중 오류 발생");
    }
  }

  @Override
  public void save() throws Exception{
    ObjectOutputStream out = new ObjectOutputStream (new BufferedOutputStream(new FileOutputStream(filename)));

    out.writeObject(bookList);

    out.flush();

    out.close();
  }
}
