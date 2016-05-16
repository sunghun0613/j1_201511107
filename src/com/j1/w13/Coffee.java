package com.j1.w13;

public class Coffee{
  void prepareRecipe(){
    boilWater();
    brewCoffeeGrinds();
    pourInCup();
    addSugarAndMilk();
  }
  public void boilWater(){
    System.out.println("Boiling water");
  }
  public void brewCoffeeBrinds(){
    System.out.println("brew Coffee Brinds");
  }
  public void pourInCup(){
    System.out.println("pour in cup");
  }
  public void addSugarAndMilk(){
    System.out.println("add sugar and milk");
  }

}