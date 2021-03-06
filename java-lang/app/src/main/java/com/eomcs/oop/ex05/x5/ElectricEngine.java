package com.eomcs.oop.ex05.x5;

public class ElectricEngine extends Option {

  public ElectricEngine(Car car) {
    super(car);
  }

  int kwh;
  public void chageBttery (int kwh) {
    this.kwh = kwh;
  }

  @Override
  public void start() {
    car.start();
  }

  @Override
  public void run() {
    if (kwh > 0) {
      System.out.println("전기로 간다");
    }
    car.run();
  }

  @Override
  public void stop() {
    car.stop();
  }
}