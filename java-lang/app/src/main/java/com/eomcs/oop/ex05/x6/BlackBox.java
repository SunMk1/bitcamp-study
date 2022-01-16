package com.eomcs.oop.ex05.x6;

public class BlackBox extends Option{

  public BlackBox(Car car) {
    super(car);
  }
  @Override
  public void run() {
    car.run();
  }
  @Override
  public void start() {
    System.out.println("블박카메라 on");
    super.start();
  }
  @Override
  public void stop() {
    System.out.println("블박카메라 off");
    super.stop();
  }
}
