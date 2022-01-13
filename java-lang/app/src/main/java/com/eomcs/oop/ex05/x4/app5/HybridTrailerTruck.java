package com.eomcs.oop.ex05.x4.app5;

import com.eomcs.oop.ex05.x4.app3.CampingTrailer;
import com.eomcs.oop.ex05.x4.app4.HybridCar;

public class HybridTrailerTruck extends HybridCar{

  public void dump() {
    System.out.println("짐 내린다!");
  }

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
