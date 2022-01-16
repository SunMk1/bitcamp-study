package com.eomcs.oop.ex05.x7;

public class CarTest1 {

  public static void main(String[] args) {
    Sedan sedan = new Sedan();
    Truck truck = new Truck();

    testSedan(sedan);
    testTruck(truck);

  }
  static void testSedan(Sedan sedan) {
    sedan.start();
    sedan.run();
    sedan.stop();
  }
  static void testTruck(Truck truck) {
    truck.launch();
    truck.go();
    truck.stopping();
    truck.weight(100);
  }

}
