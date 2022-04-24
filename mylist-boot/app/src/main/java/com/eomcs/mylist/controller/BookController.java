package com.eomcs.mylist.controller;

import java.io.File;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
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
  public Object add(Book book, MultipartFile file) throws Exception {
    try {
      book.setPhoto(saveFile(file));
      return bookDao.insert(book);
    } catch (Exception e) {
      e.printStackTrace();
      return "error!";
    }
  }

  @RequestMapping("/book/get")
  public Object get(int no) throws Exception {
    Book book = bookDao.findByNo(no);
    return book == null ? "" : book;
  }

  @RequestMapping("/book/update")
  public Object update(Book book, MultipartFile file) throws Exception {
    try {
      book.setPhoto(saveFile(file));
      return bookDao.update(book);
    } catch (Exception e) {
      e.printStackTrace();
      return "error!";
    }
  }

  @RequestMapping("/book/delete")
  public Object delete(int no) throws Exception {
    return bookDao.delete(no);
  }

  private String saveFile(MultipartFile file) throws Exception {
    if (file != null && file.getSize() == 0) {
      String filename = UUID.randomUUID().toString();
      int dotIndex = file.getOriginalFilename().lastIndexOf(".");
      if (dotIndex != -1) {
        filename += file.getOriginalFilename().substring(dotIndex);
      }
      File photoFile = new File("c:/upload/book/" + filename);
      file.transferTo(photoFile);

      return filename;
    } else {
      return null;
    }
  }
}
