package com.eomcs.lang.ex07;

import java.util.Scanner;

//# 메서드 : 사용 전
//
public class Exam0111Test {

  static void printSpaces(int len) {
    int starCnt = 1;
    while (starCnt <= len) {
      System.out.print(" ");
      starCnt++;
    }
  }

  static void printStars(int len) {
    int starCnt = 1;
    while (starCnt <= len) {
      System.out.print("*");
      starCnt++;
    }
  }

  static int getSpaceLength(int total, int starLen) {
    return (total - starLen) / 2;
  }

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int len = keyScan.nextInt();
    keyScan.close();

    for (int starLen = 1; starLen <= len; starLen +=2) {
      printSpaces(getSpaceLength(len, starLen));
      printStars(starLen);
      System.out.println();
    }
  }
}