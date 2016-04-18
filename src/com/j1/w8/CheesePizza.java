package com.j1.w8;

public class CheesePizza extends Pizza{
  PizzaIngredientFactory ingredientFactory;
  public CheesePizza(PizzaIngredientFactory f){
    this.ingredientFactory=f;
  }
  void prepare(){
    System.out.println("Preparing"+name);
    dough=ingredientFactory.createDough();
    cheese=ingredientFactory.createCheese();
  }
}