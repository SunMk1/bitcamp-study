package com.eomcs.mylist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eomcs.mylist.dao.BookDao;
import com.eomcs.mylist.domain.Book;

@RestController
public class BookController {

  @Autowired
  BookDao bookDao;

  @RequestMapping("/book/list")
  public Object list() { 
    return bookDao.findAll();
  }

  @RequestMapping("/book/add")
  public Object add(Book book) throws Exception {
    bookDao.insert(book);

    return bookDao.countAll();
  }

  @RequestMapping("/book/get")
  public Object get(int index) throws Exception {
    return bookDao.findByNo(index) == null ? "" : bookDao.findByNo(index);
  }

  @RequestMapping("/book/update")
  public Object update(int index, Book book) throws Exception {
    return bookDao.findByNo(index) == null ? 0 : bookDao.update(index, book);
  }

  @RequestMapping("/book/delete")
  public Object delete(int index) throws Exception {
    return bookDao.delet(index);
  }
}
