package com.j1.w12;

public class DuckAdapter implements Turkey{
  Duck duck;
  public DuckAdapter(Duck duck){
    this.duck=duck;
  }
  public void gobble(){
    duck.quack();
  }
  public void fly(){
    duck.fly();
  }
}