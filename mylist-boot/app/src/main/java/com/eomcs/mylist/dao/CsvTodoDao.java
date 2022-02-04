package com.eomcs.mylist.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import com.eomcs.mylist.domain.Todo;

//@Repository
public class CsvTodoDao extends AbstractTodoDao {
  String filename = "todos.csv";

  public CsvTodoDao() {
    try {
      BufferedReader in = new BufferedReader(new FileReader(filename));

      String csvStr;
      while ((csvStr = in.readLine()) != null) {
        todoList.add(Todo.valueOf(csvStr)); 
      }
      in.close();
    } catch (Exception e) {
      System.out.println("데이터 로딩중 오류 발생");
    }
  }

  @Override
  public void save() throws Exception{
    PrintWriter out = new PrintWriter (new BufferedWriter(new FileWriter(filename)));

    for (int i = 0; i < todoList.size(); i++) {
      Todo todo = (Todo) todoList.get(i);
      out.println(todo.toCsvString());
    }
    out.flush();

    out.close();
  }
}
