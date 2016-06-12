package com.j1.w15_1;

public class GumballMachineTestDrive {
  public static void main(String[] args) {
    GumballMachine gm = new GumballMachine(5);
    System.out.println(gm);
    gm.insertQuarter();
    gm.turnCrank();
    gm.dispense();
    
    System.out.println(" ");
    gm.insertQuarter();
    gm.turnCrank();
    gm.dispense();
  }
}