package com.eomcs.mylist.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eomcs.mylist.domain.Contact;
import com.eomcs.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class ContactController {

  ArrayList contactList = new ArrayList();

  public ContactController() throws Exception {
    System.out.println("ContactController() 호출됨!");

    try {
      BufferedReader in = new BufferedReader(new FileReader("contacts.json"));
      contactList = new ArrayList(new ObjectMapper().readValue(in.readLine(), Contact[].class));

      in.close();
    } catch (Exception e) {
      System.out.println("데이터 로딩중에 오류발생");
    }
  }

  @RequestMapping("/contact/list")
  public Object list() { 
    return contactList.toArray();
  }

  @RequestMapping("/contact/add")
  public Object add(Contact contact) {
    contactList.add(contact);
    return contactList.size();
  }

  @RequestMapping("/contact/get")
  public Object get(String email) {
    int index = indexOf(email);
    if (index == -1) {
      return "";
    }
    return contactList.get(index);
  }

  @RequestMapping("/contact/update")
  public Object update(Contact contact) {
    int index = indexOf(contact.getEmail());
    if (index == -1) {
      return 0;
    }
    return contactList.set(index, contact) == null ? 0 : 1;
  }

  @RequestMapping("/contact/delete")
  public Object delete(String email) {
    int index = indexOf(email);
    if (index == -1) {
      return 0;
    }

    contactList.remove(index); // 메서드 이름으로 코드의 의미를 짐작할 수 있다. 이것이 메서드를 분리하는 이유이다.
    return 1;
  }


  //기능 :
  // - 이메일로 연락처 정보를 찾는다.
  // - 찾은 연락처의 배열 인덱스를 리턴한다.
  int indexOf(String email) {
    for (int i=0; i < contactList.size(); i++) {
      Contact contact = (Contact) contactList.get(i);
      if (contact.getEmail().equals(email)) {
        return i;
      }
    }
    return -1;
  }

  @RequestMapping("/contact/save")
  public Object save() throws Exception {
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("contacts.json")));

    ObjectMapper mapper = new ObjectMapper();

    String jsonStr = mapper.writeValueAsString(contactList.toArray());

    out.println(jsonStr);

    out.close();
    return contactList.size();
  }
}
