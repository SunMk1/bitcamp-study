package com.eomcs.oop.ex05.x7;

public class Truck {
  int cc;
  int valve;
  int weight;

  public void launch() {
    System.out.println("트럭 나가신다");
  }
  public void go() {
    System.out.println("트럭 달린다");
  }
  public void stopping() {
    System.out.println("트럭 멈춘다");
  }
  public void weight(int weight) {
    this.weight = weight;
    if (weight > 100) {
      System.out.println("적재량 초과");
    } else {
      System.out.println("문제없이 달린다");
    }
  }
  public void dump() {
    System.out.println("짐을 싣는다");
  }

}
