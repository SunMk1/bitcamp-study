package com.eomcs.oop.ex05.x6;

public class SnowChain extends Option {

  public SnowChain(Car car) {
    super(car);
  }

  @Override
  public void run() {
    System.out.println("눈길에서 안전하다!");
    car.run();
  }

}
