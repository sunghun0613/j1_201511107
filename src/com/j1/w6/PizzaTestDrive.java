package com.j1.w6;

public class PizzaTestDrive{
  public static void main(String[] args){
    SimplePizzaFactory factory=new SimplePizzaFactory();
    PizzaStore store= new PizzaStore(factory);
    Pizza pizza=store.orderPizza("cheese");
    System.out.println(pizza);
    
    pizza = store.orderPizza("veggie");
    System.out.println(pizza);
  }
}