package com.eomcs.oop.ex05.x6;

public class Cartest3 {

  public static void main(String[] args) {
    Truck truck = new Truck();
    BlackBox blackBox = new BlackBox(truck);
    testCar(blackBox);
  }
  static void testCar(Car car) {
    car.start();
    car.run();
    car.stop();
  }

}
