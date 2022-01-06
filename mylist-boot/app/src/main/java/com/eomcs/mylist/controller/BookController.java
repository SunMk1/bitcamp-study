package com.eomcs.mylist.controller;

import java.sql.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eomcs.mylist.domain.Book;
import com.eomcs.util.ArrayList;

@RestController
public class BookController {

  ArrayList bookList = new ArrayList();

  @RequestMapping("/book/list")
  public Object list() { 
    return bookList.toArray();
  }

  @RequestMapping("/book/add")
  public Object add(Book book) {
    book.setReadDate(new Date(System.currentTimeMillis()));
    bookList.add(book);

    return bookList.size();
  }

  @RequestMapping("/book/get")
  public Object get(String title) {
    int index = indexOf(title);
    if (index == -1) {
      return "";
    }
    return  bookList.get(index);
  }

  @RequestMapping("/book/update")
  public Object update(Book book) {
    int index = indexOf(book.getTitle());
    if (index == -1) {
      return 0;
    }
    Book old = (Book) bookList.get(index);
    book.setReadDate(old.getReadDate());
    return bookList.set(index, book) == null ? 0 : 1;
  }

  @RequestMapping("/book/delete")
  public Object delete(String title) {
    int index = indexOf(title);
    if (index == -1) {
      return 0;
    }

    bookList.remove(index); // 메서드 이름으로 코드의 의미를 짐작할 수 있다. 이것이 메서드를 분리하는 이유이다.
    return 1;
  }

  int indexOf(String title) {
    for (int i=0; i < bookList.size(); i++) {
      Book book = (Book) bookList.get(i);
      if (book.getTitle().equals(title)) {
        return i;
      }
    }
    return -1;
  }
}
