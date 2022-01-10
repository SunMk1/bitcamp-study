package com.eomcs.oop.ex05.x1.test3;

// 기존 클래스 복사 후 기능 추가

public class CalculatorTest {
  public static void main(String[] args) {
    Calculator2 c = new Calculator2();

    //    c.plus(100);
    //    c.minus(200);
    c.multiple(2);

    System.out.println(c.result);
  }

}