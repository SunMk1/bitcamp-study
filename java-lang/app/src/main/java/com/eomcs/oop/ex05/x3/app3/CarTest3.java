package com.eomcs.oop.ex05.x3.app3;

public class CarTest3 {

  public static void main(String[] args) {

    CampingTrailer trailer = new CampingTrailer();

    Engine car = new Engine();
    car.setTariler(trailer);
    car.start();
    car.run();
    car.stop();


  }

}
