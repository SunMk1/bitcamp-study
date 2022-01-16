package com.eomcs.oop.ex05.x6;

public class Cartest2 {
  public static void main(String[] args) {
    Sedan sedan= new Sedan();
    testCar(sedan);
  }
  static void testCar(Car car) {
    car.start();
    car.run();
    car.stop();
  }
}
