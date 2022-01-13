package com.eomcs.mylist.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eomcs.mylist.domain.Board;
import com.eomcs.util.ArrayList;

@RestController
public class BoardController {

  ArrayList boardList = new ArrayList();

  public BoardController() throws Exception {
    System.out.println("BoardController() 호출됨!");

    BufferedReader in = new BufferedReader(new FileReader("boards.csv"));

    String line;
    while ((line = in.readLine()) != null) {
      boardList.add(Board.valueOf(line));
    }
    in.close();
  }

  @RequestMapping("/board/list")
  public Object list() { 
    return boardList.toArray();
  }

  @RequestMapping("/board/add")
  public Object add(Board board) {
    board.setCreatedDate(new Date(System.currentTimeMillis()));
    boardList.add(board);

    return boardList.size();
  }

  @RequestMapping("/board/get")
  public Object get(int index) {
    if (index < 0 || index >= boardList.size()) { 
      return "";
    }
    Board board = (Board) boardList.get(index);
    board.setViewCount(board.getViewCount() + 1);
    return board;
  }

  @RequestMapping("/board/update")
  public Object update(int index, Board board) {
    if (index < 0 || index >= boardList.size()) { 
      return 0;
    }
    Board old = (Board) boardList.get(index);
    board.setViewCount(old.getViewCount());
    board.setCreatedDate(old.getCreatedDate());
    return boardList.set(index, board) == null ? 0 : 1;
  }

  @RequestMapping("/board/delete")
  public Object delete(int index) {
    if (index < 0 || index >= boardList.size()) {
      return 0;
    }
    return boardList.remove(index) == null ? 0 : 1;
  }

  @RequestMapping("/board/save")
  public Object save() throws Exception {
    PrintWriter out = new PrintWriter(new FileWriter("boards.csv"));

    Object[] arr = boardList.toArray();
    for (Object obj : arr) {
      Board board = (Board) obj;
      out.println(board.toCsvString());
    }

    out.close();
    return arr.length;
  }
}
