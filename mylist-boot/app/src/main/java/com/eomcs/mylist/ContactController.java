package com.eomcs.mylist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

  String[] contacts = new String[5];
  int size = 0;

  @RequestMapping("/contact/list")
  public Object list() { 
    String[] arr =  new String[size];
    for (int i=0; i < size; i++) {
      arr[i] = contacts[i];
    }
    return arr;
  }

  @RequestMapping("/contact/add")
  public Object add(String name,String email,String tel, String company) {
    String contact = name + "," + email + "," + tel + "," + company;
    contacts[size++] = contact;

    return size;
  }
  //  if (size == contacts.length) {
  //    int newCapacity = contacts.length + (contacts.length >> 1);
  //    String[] arr = new String[newCapacity];
  //  }

  @RequestMapping("/contact/get")
  public Object get(String email) {
    for (int i=0; i < size; i++) {
      if (contacts[i].split(",")[1].equals(email)) {
        return contacts[i];
      }
    }
    return "";
  }

  @RequestMapping("/contact/update")
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
  @RequestMapping("/contact/delete")
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
