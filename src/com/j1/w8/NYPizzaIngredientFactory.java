package com.j1.w8;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
  public Dough createDough(){
    return new ThinCrustDough();
  }
  public Cheese createCheese(){
    return new VeggianoCheese();
  }
}