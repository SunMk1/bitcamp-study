package com.eomcs.mylist;

public class Board {

  String titel;
  String content;
  int viewCount;
  java.sql.Date createdDate;


  @Override
  public String toString() {
    return "Board [titel=" + titel + ", content=" + content + ", viewCount=" + viewCount
        + ", createdDate=" + createdDate + "]";
  }

  public String getTitel() {
    return titel;
  }
  public void setTitel(String titel) {
    this.titel = titel;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public int getViewCount() {
    return viewCount;
  }
  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }
  public java.sql.Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(java.sql.Date createdDate) {
    this.createdDate = createdDate;
  }

}
