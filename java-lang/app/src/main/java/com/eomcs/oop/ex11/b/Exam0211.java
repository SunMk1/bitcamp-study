// static nested class : 다른 멤버에 접근하기
package com.eomcs.oop.ex11.b;

class B2 {
  // 클래스 멤버
  static int v1;
  static void m1() {}

  // 인스턴스 멤버
  int v2;
  void m2() {}

  static class X {
    void test() {
      B2.v1 = 100;
      B2.m1();

      v1 = 200; 
      m1(); 
    }
  }
}

public class Exam0211 {

  public static void main(String[] args) {
    B.X obj = new B.X();
    obj.test();

    System.out.println(B.v1);

  }

}
