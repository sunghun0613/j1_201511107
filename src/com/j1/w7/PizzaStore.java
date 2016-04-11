package com.j1.w7;
/*
public class PizzaStore{
  SimplePizzaFactory factory;
  public PizzaStore(SimplePizzaFactory factory){
    this.factory=factory;
  }
  public Pizza orderPizza(String type){
    Pizza pizza=factory.createPizza(type);
    pizza.prepare();
  }
}*/
public abstract class PizzaStore{
  abstract Pizza createPizza(String item);
  public Pizza orderPizza(String type){
    Pizza pizza=createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}