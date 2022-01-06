package com.eomcs.mylist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eomcs.mylist.domain.Contact;
import com.eomcs.util.ArrayList;

@RestController
public class ContactController {

  ArrayList contactsList = new ArrayList();

  @RequestMapping("/contact/list")
  public Object list() { 
    return contactsList.toArray();
  }

  @RequestMapping("/contact/add")
  public Object add(Contact contact) {
    contactsList.add(contact);
    return contactsList.size();
  }

  @RequestMapping("/contact/get")
  public Object get(String email) {
    int index = indexOf(email);
    if (index == -1) {
      return "";
    }
    return contactsList.get(index);
  }

  @RequestMapping("/contact/update")
  public Object update(Contact contact) {
    int index = indexOf(contact.getEmail());
    if (index == -1) {
      return 0;
    }
    return contactsList.set(index, contact) == null ? 0 : 1;
  }

  @RequestMapping("/contact/delete")
  public Object delete(String email) {
    int index = indexOf(email);
    if (index == -1) {
      return 0;
    }

    contactsList.remove(index); // 메서드 이름으로 코드의 의미를 짐작할 수 있다. 이것이 메서드를 분리하는 이유이다.
    return 1;
  }

  //기능 :
  // - 이메일로 연락처 정보를 찾는다.
  // - 찾은 연락처의 배열 인덱스를 리턴한다.
  int indexOf(String email) {
    for (int i=0; i < contactsList.size(); i++) {
      Contact contact = (Contact) contactsList.get(i);
      if (contact.getEmail().equals(email)) {
        return i;
      }
    }
    return -1;
  }
}
