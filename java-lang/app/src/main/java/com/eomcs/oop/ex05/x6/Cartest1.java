package com.eomcs.oop.ex05.x6;

public class Cartest1 {
  public static void main(String[] args) {
    Sedan sedan = new Sedan();
    sedan.start();
    sedan.run();
    sedan.stop();

    Truck truck = new Truck();
    truck.launch();
    truck.go();
    truck.stopping();
  }
}
