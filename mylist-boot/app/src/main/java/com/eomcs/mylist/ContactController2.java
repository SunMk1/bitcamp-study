package com.eomcs.mylist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController2 {

  String[] contacts = new String[5];
  int size = 0;

  @RequestMapping("/contact2/list")
  public Object list() { 
    String[] arr =  new String[size];
    for (int i=0; i < size; i++) {
      arr[i] = contacts[i];
    }
    return arr;
  }

  @RequestMapping("/contact2/add")
  public Object add(String name,String email,String tel, String company) {
    String contact = name + "," + email + "," + tel + "," + company;
    contacts[size++] = contact;

    return size;
  }

  @RequestMapping("/contact2/get")
  public Object get(String email) {
    for (int i=0; i < size; i++) {
      if (contacts[i].split(",")[1].equals(email)) {
        return contacts[i];
      }
    }
    return "";
  }

  @RequestMapping("/contact2/update")
  public Object update(String name,String email,String tel, String company) {
    String contact = name + "," + email + "," + tel + "," + company;
    for (int i=0; i < size; i++) {
      if (contacts[i].split(",")[1].equals(email)) {
        contacts[i] = contact;
        return 1;
      }
    }
    return 0;
  }
  @RequestMapping("/contact2/delete")
  public Object delete(String email) {
    for (int i=0; i < size; i++) {
      if (contacts[i].split(",")[1].equals(email)) {
        for (int j = i + 1; j < size; j++) {
          contacts[j-1] = contacts[j];
        }
        size--;
        return 1;
      }
    }
    return 0;
  }
}
