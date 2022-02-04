package com.eomcs.mylist.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.springframework.stereotype.Repository;
import com.eomcs.mylist.domain.Todo;

@Repository
public class BinaryTodoDao extends AbstractTodoDao {
  String filename = "todos.bin";

  public BinaryTodoDao() {
    try {
      DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(filename)));

      int len = in.readInt();

      for (int i = 0; i < len; i++) {
        Todo todo = new Todo();
        todo.setTitle(in.readUTF());
        todo.setDone(in.readBoolean());

        todoList.add(todo);
      }
      in.close();
    } catch (Exception e) {
      System.out.println("데이터 로딩중 오류 발생");
    }
  }

  @Override
  public void save() throws Exception{
    DataOutputStream out = new DataOutputStream (new BufferedOutputStream(new FileOutputStream(filename)));

    out.writeInt(todoList.size());

    for (int i = 0; i < todoList.size(); i++) {
      Todo todo = (Todo) todoList.get(i);
      out.writeUTF(todo.getTitle());
      out.writeBoolean(todo.isDone());
    }
    out.flush();

    out.close();
  }
}
