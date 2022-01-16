package com.eomcs.oop.ex05.x6;

public class SUV extends Car{
  boolean enable4wd;

  public void active4wd(boolean enable) {
    this.enable4wd = enable;
  }
  @Override
  public void run() {
    if (enable4wd == true) {
      System.out.println("강력한 파워로 달린다.");
    } else {
      System.out.println("그냥 달린다.");
    }
  }
}
