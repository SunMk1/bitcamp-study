package com.eomcs.mylist.dao;

import java.io.File;
import com.eomcs.mylist.domain.Todo;
import com.fasterxml.jackson.databind.ObjectMapper;

//@Repository
public class JsonTodoDao extends AbstractTodoDao {
  String filename = "todos.json";

  public JsonTodoDao() {
    try {
      ObjectMapper mapper = new ObjectMapper();
      todoList.addAll(mapper.readValue(new File(filename), Todo[].class));
    } catch (Exception e) {
      System.out.println("데이터 로딩중 오류 발생");
    }
  }

  @Override
  public void save() throws Exception{
    ObjectMapper mapper = new ObjectMapper();
    mapper.writeValue(new File(filename), todoList.toArray());
  }

  @Override
  public int countAll() {
    return todoList.size();
  }
}
