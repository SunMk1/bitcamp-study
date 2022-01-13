package com.eomcs.oop.ex05.x3;

import com.eomcs.oop.ex05.x2.CampingTrailer;

public class Engine {
  int cc;
  int valve;

  public void run() {
    if (kwh > 0) {
      System.out.println("전기로 간다!");
      return;
    }
    if (trailer == null) {
      System.out.println("엔진이 돈다!");
    } else {
      System.out.println("느릿 느릿 조심히 움직인다!");
    }
  }

  public void start() {
    System.out.println("시동을 킨다!");
  }

  public void stop() {
    System.out.println("시동을 끈다!");
  }

  public void dump() {
    System.out.println("짐 내린다!");
  }

  CampingTrailer trailer;
  public void setTariler(CampingTrailer trailer) {
    this.trailer = trailer;
  }

  int kwh;
  public void chageBttery (int kwh) {
    this.kwh = kwh;
  }

}
