package com.eomcs.oop.ex05.x1.upgrade1;

// 기존 클래스에 곱하기 기능 추가

public class CalculatorTest {
  public static void main(String[] args) {
    com.eomcs.oop.ex05.x1.Calculator c = new com.eomcs.oop.ex05.x1.Calculator();

    c.plus(100);
    c.minus(200);
    //    c.multiple(2); // 추가한 기능 호출

    System.out.println(c.result);
  }
}