package com.eomcs.mylist.dao;

import java.io.File;
import java.util.List;
import com.eomcs.mylist.domain.Board;
import com.fasterxml.jackson.databind.ObjectMapper;

//@Repository
public class JsonBoardDao extends AbstractBoardDao {
  String filename = "boards.json";

  public JsonBoardDao() {
    try {
      ObjectMapper mapper = new ObjectMapper();
      boardList.addAll(mapper.readValue(new File(filename), mapper.getTypeFactory().constructCollectionType(List.class, Board.class)));
    } catch (Exception e) {
      System.out.println("데이터 로딩중 오류 발생");
    }
  } 

  @Override 
  public void save() throws Exception{
    ObjectMapper mapper = new ObjectMapper();
    mapper.writeValue(new File(filename), boardList.toArray());
  }

  @Override
  public int countAll() {
    return boardList.size();
  }
}
