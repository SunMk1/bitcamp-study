package com.eomcs.oop.ex05.x3.app3;

public class Engine {
  int cc;
  int valve;

  public void run() {
    if (trailer == null) {
      System.out.println("씽씽 달린다!");
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

  CampingTrailer trailer;
  public void setTariler(CampingTrailer trailer) {
    this.trailer = trailer;
  }
}
