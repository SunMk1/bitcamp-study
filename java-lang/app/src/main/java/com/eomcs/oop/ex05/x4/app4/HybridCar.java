package com.eomcs.oop.ex05.x4.app4;

import com.eomcs.oop.ex05.x4.app1.Car;

public class HybridCar extends Car{

  int kwh;
  public void chageBttery (int kwh) {
    this.kwh = kwh;
  }

  @Override
  public void run() {
    if (kwh > 0) {
      System.out.println("전기로 간다!");
    } else
      super.run();
  }
}
