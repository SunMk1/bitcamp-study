package com.eomcs.oop.ex05.x1.upgrade2;

// 기존 클래스 복사 후 기능 추가

public class CalculatorTest {
  public static void main(String[] args) {
    Calculator2 c = new Calculator2();
    Calculator a = new Calculator();

    a.plus(100);
    a.minus(200);
    c.multiple(2);

    System.out.println(c.result);
  }

}