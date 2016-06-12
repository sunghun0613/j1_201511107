package com.j1.w15_1;

public interface HasQuarterState implements State{
  GumballMachine gumballMachine;
  public void insertQuarter(){
    System.out.println("You cannot insert another quarter");
  }
  public void ejectQuarter(){
    System.out.println("Quarter returned");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }
  public void turnCrank(){
    System.out.println("You turnd..");
    gumballMachine.setState(gumballMachine.getSoldState());
  }
  public void dispense();
}