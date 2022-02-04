package com.eomcs.mylist.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import com.eomcs.mylist.domain.Book;

//@Repository
public class CsvBookDao extends AbstractBookDao {
  String filename = "books.csv";

  public CsvBookDao() {
    try {
      BufferedReader in = new BufferedReader(new FileReader(filename));

      String csvStr;
      while ((csvStr = in.readLine()) != null) {
        bookList.add(Book.valueOf(csvStr)); 
      }
      in.close();
    } catch (Exception e) {
      System.out.println("데이터 로딩중 오류 발생");
    }
  }

  @Override
  public void save() throws Exception{
    PrintWriter out = new PrintWriter (new BufferedWriter(new FileWriter(filename)));

    for (int i = 0; i < bookList.size(); i++) {
      Book book = (Book) bookList.get(i);
      out.println(book.toCsvString());
    }
    out.flush();

    out.close();
  }
}
