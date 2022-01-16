package com.eomcs.oop.ex05.x6;

public abstract class Car {

  int cc;
  int valve;

  public void start() {
    System.out.println("시동을 킨다.");
  }
  public void stop() {
    System.out.println("시동은 끈다.");
  }
  public abstract void run();
}
