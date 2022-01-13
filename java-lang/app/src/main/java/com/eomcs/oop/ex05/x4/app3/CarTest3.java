package com.eomcs.oop.ex05.x4.app3;

public class CarTest3 {

  public static void main(String[] args) {

    CampingTrailer trailer = new CampingTrailer();

    TrailerCar car = new TrailerCar();
    car.setTariler(trailer);
    car.start();
    car.run();
    car.stop();
  }

}
