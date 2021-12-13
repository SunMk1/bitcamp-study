package com.eomcs.mylist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class my1Controller {
  String[] contact = new String[5];
  int size = 0;

  @RequestMapping("/my1/list")
  public Object list() {
    String[] movies = new String[size];
    for (int i=0; i < size; i++) {
      movies[i] = contact[i];
    }
    return movies;
  }

  @RequestMapping("/my1/add")
  public Object add(String name, String genre, String dir, String grade) {
    String movies = name + "," + genre + "," + dir + "," + grade;
    contact[size] = movies;

    size++;
    return size;
  }

  @RequestMapping("/my1/get")
  public Object get(String name) {
    for (int i=0; i < size; i++) {
      if (contact[i].split(",")[0].equals(name)) {
        return contact[i];
      }
    }
    return "";
  }

  @RequestMapping("/my1/update")
  public Object update(String name, String genre, String dir, String grade) {
    for (int i=0; i < size; i++) {
      if (contact[i].split(",")[0].equals(name)) {
        contact[i] = name + "," + genre + "," + dir + "," + grade;
        return 1;
      }
    }
    return 0;
  }

  @RequestMapping("/my1/delete")
  public Object delete(String name) {
    for (int i=0; i < size; i++) {
      if (contact[i].split(",")[0].equals(name)) {
        for (int j = i + 1; j < size; j++) {
          contact[j-1] = contact[j];
        }
        size--;
        return 1;
      }
    }
    return 0;
  }
}

