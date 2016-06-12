
package com.j1.w15_1;

public class SoldOutState implements State {
  GumballMachine gumballMachine;
  
  public SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter() {
    System.out.println("SOLD OUT");
  }
  
  public void ejectQuarter() {
    System.out.println("SOLD OUT");
  }
  
  public void turnCrank() {
    System.out.println("SOLD OUT");
  }
  
  public void dispense() {
    System.out.println("SOLD OUT");
  }
}