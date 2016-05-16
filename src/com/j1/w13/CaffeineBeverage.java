package com.j1.w13;

public abstract class CaffeineBeverage{
  public final void prepareRecipe() {
    brew();
    addCondiments();
    boilWater();
    pourinCup();
  }
  abstract void brew();
  
  abstract void addCondiments();
 
  void boilWater() {
    System.out.println("boilWater");
  }
   void pourinCup() {
    System.out.println("pourinCup");
  }
}