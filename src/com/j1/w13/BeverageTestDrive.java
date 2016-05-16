package com.j1.w13;

public class BeverageTestDrive {
 public static void main(String[] args) {
 
  Tea2 tea = new Tea2();
  Coffee2 coffee = new Coffee2();
 
  System.out.println("Making tea...");
  tea.prepareRecipe();
 
  System.out.println("Making coffee...");
  coffee.prepareRecipe();

 
  TeaWithHook teaHook = new TeaWithHook();
  CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
  System.out.println("Making tea...");
  teaHook.prepareRecipe();
 
  System.out.println("Making coffee...");
  coffeeHook.prepareRecipe();
 }
}