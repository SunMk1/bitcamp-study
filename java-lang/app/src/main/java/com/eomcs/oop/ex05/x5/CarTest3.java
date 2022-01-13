package com.eomcs.oop.ex05.x5;

public class CarTest3 {

  public static void main(String[] args) {
    Sedan sedan = new Sedan();

    ElectricEngine elctricOption = new ElectricEngine(sedan);
    elctricOption.chageBttery(100);

    Trailer trailer = new Trailer(elctricOption);
    trailer.start();
    trailer.run();
    trailer.stop();

    System.out.println("-------------------");

    Truck truck = new Truck();
    ElectricEngine elctricOption2 = new ElectricEngine(truck);
    elctricOption2.chageBttery(100);

    elctricOption2.start();
    elctricOption2.run();
    elctricOption2.stop();
  }

}
