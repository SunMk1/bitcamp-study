package com.eomcs.lang.ex04;

//# 값 저장과 메모리 크기 - 작은 크기의 메모리 값을 큰 크기의 메모리에 저장할 수 있다.
//
public class Exam0910 {
  public static void main(String[] args) {
    byte b = 100;
    short v1 = b;

    short s = 100;
    int v2 = s;

    int i = 98765678;
    long v3 = i;

    long l = 98765678;

    char c = 100;
    //    short x1 = c;// char(0 ~ 65535), short(-32768 ~ 32767) 값의 범위가 달라 변환 불가

  }
}