package com.eomcs.mylist.dao;

import com.eomcs.mylist.domain.Board;

public interface BoardDao {
  public int countAll();

  public Object[] findAll();

  public void insert(Board board) throws Exception; 

  public Board findByNo(int no);

  public int update(int no, Board board) throws Exception;

  public int delet(int no) throws Exception;

  public void increaseViewCount(int no) throws Exception;
}
