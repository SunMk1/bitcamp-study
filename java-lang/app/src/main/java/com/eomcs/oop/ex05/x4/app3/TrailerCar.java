package com.eomcs.oop.ex05.x4.app3;

import com.eomcs.oop.ex05.x4.app1.Car;

public class TrailerCar extends Car{
  CampingTrailer trailer;

  public void setTariler(CampingTrailer trailer) {
    this.trailer = trailer;
  }

  @Override
  public void run() {
    if (trailer == null) {
      super.run();
    } else {
      System.out.println("느릿 느릿 조심히 움직인다!");
    }
  }
}
