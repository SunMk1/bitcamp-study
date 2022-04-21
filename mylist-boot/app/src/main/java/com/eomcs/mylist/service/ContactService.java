package com.eomcs.mylist.service;

import java.util.List;
import com.eomcs.mylist.domain.Contact;

public interface ContactService {

  public int add(Contact contact);

  public List<Contact> list();

  public Contact get(int no);

  public int update(Contact contact);

  public int delete(int no);

}
