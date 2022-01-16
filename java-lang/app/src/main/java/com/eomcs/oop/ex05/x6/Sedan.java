package com.eomcs.oop.ex05.x6;

public class Sedan extends Car {

  boolean auto;
  boolean controllSunroof;

  @Override
  public void run() {
    if (auto == true) {
      System.out.println("자동으로 달린다.");
    } else {
      System.out.println("쌩쌩 달린다.");
    }
  }
  public void SunroofController() {
    if (controllSunroof == false) {
      System.out.println("썬루프를 연다.");
      this.controllSunroof = true;
    } else {
      System.out.println("썬루프를 닫는다.");
      this.controllSunroof = false;
    }
  }
}
