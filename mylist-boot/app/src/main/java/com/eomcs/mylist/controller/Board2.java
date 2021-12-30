package com.eomcs.mylist.controller;

import java.sql.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eomcs.mylist.Board;
import com.eomcs.util.Array2;

@RestController 
public class Board2 {

  // Board 객체 목록을 저장할 메모리를 준비한다.
  Array2 boardList = new Array2();

  @RequestMapping("/board/list")
  public Object list() {
    return Array2.toArray(boardList); 
  }

  @RequestMapping("/board/add")
  public Object add(Board board) {

    board.setCreatedDate(new Date(System.currentTimeMillis()));
    Array2.add(boardList, board);
    return boardList.size;
  }


  @RequestMapping("/board/get")
  public Object get(int index) {
    if (index < 0 || index >= boardList.size) {
      return "";
    }
    Board board = (Board) boardList.list[index];
    board.setViewCount(board.getViewCount()+1;); 
    return board;
  }

  @RequestMapping("/board/update")
  public Object update(int index, Board board) {
    if (index < 0 || index >= boardList.size) {
      return 0;
    }

    Board old = (Board) boardList.list[index];
    board.viewCount = old.viewCount;
    board.createdDate = old.createdDate;

    return Array2.set(boardList, index, board) == null ? 0 : 1;
  }

  @RequestMapping("/board/delete")
  public Object delete(int index) {
    if (index < 0 || index >= boardList.size) {
      return 0;
    }
    return Array2.remove(boardList, index) == null ? 0 : 1;
  }
}




