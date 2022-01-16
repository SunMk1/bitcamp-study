package com.eomcs.oop.ex05.x7;

public class Sedan {
  int cc;
  int valve;
  boolean auto;
  boolean openSunroof;

  public void start() {
    System.out.println("세단 나가신다");
  }
  public void run() {
    System.out.println("세단 달린다");
  }
  public void stop() {
    System.out.println("세단 멈춘다");
  }
  public void openSunroof() {
    if (openSunroof == false) {
      System.out.println("선루프 연다");
      this.openSunroof = true;
    } else {
      System.out.println("이미 열었다");
    }
  }
  public void closeSunroof() {
    if (openSunroof == true) {
      System.out.println("선루프 닫는다");
      this.openSunroof = false;
    } else {
      System.out.println("이미 닫혀있다");
    }
  }
}
