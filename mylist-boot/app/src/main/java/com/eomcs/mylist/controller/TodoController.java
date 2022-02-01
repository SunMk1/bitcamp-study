package com.eomcs.mylist.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eomcs.mylist.domain.Todo;
import com.eomcs.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class TodoController {

  ArrayList todoList = new ArrayList();

  public TodoController() throws Exception {
    System.out.println("TodoController() 호출됨!");

    try {
      BufferedReader in = new BufferedReader(new FileReader("todos.json"));
      ObjectMapper mapper = new ObjectMapper();
      String jsonStr = in.readLine();

      Todo[] todos = mapper.readValue(jsonStr, Todo[].class);

      for (Todo todo : todos) {
        todoList.add(todo); 
      }

      in.close();
    } catch (Exception e) {
      System.out.println("데이터 로딩중에 오류발생");
    }
  }

  @RequestMapping("/todo/list")
  public Object list() { 
    return todoList.toArray();
  }

  @RequestMapping("/todo/add")
  public Object add(Todo todo) {
    todoList.add(todo);
    return todoList.size();
  }

  @RequestMapping("/todo/update")
  public Object update(int index, Todo todo) {
    if (index < 0 || index >= todoList.size()) {
      return 0;
    }
    Todo old = (Todo) todoList.get(index);
    todo.setDone(old.isDone());
    return todoList.set(index, todo) == null ? 0 : 1;
  }

  @RequestMapping("/todo/check")
  public Object check(int index, boolean done) {
    if (index < 0 || index >= todoList.size()) {
      return 0; //인덱스가 무효해서 설정하지 못했다.
    }
    ((Todo)todoList.get(index)).setDone(done);
    return 1; // 해당 항목의 상태를 변경했다.
  }

  @RequestMapping("/todo/delete")
  public Object delete(int index) {
    if (index < 0 || index >= todoList.size()) {
      return 0;
    }
    todoList.remove(index); // 메서드 이름으로 코드의 의미를 짐작할 수 있다. 이것이 메서드를 분리하는 이유이다.
    return 1;
  }

  @RequestMapping("/todo/save")
  public Object save() throws Exception {
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("todos.json")));

    ObjectMapper mapper = new ObjectMapper();

    String jsonStr = mapper.writeValueAsString(todoList.toArray());

    out.println(jsonStr);

    out.close();
    return todoList.size();
  }
}
