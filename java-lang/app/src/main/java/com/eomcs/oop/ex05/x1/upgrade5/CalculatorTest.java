package com.eomcs.oop.ex05.x1.upgrade5;

public class CalculatorTest {
  public static void main(String[] args) {

    com.eomcs.oop.ex05.x1.Calculator calculator = new com.eomcs.oop.ex05.x1.Calculator(); 
    Calculator2 upgradeCalculator = new Calculator2(calculator);

    upgradeCalculator.plus(100);
    upgradeCalculator.minus(200);
    upgradeCalculator.multiple(2);

    System.out.println(upgradeCalculator.getResult());
  }

}
