package com.eomcs.mylist.dao;

import java.util.List;
import com.eomcs.mylist.domain.Board;

public interface BoardDao {
  int countAll();

  List<Board> findAll();

  int insert(Board board); 

  Board findByNo(int no);

  int update(Board board);

  int delet(int no);

  int updateViewCount(int no);
}
