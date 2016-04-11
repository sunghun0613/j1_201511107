package com.j1.w7;


public class PizzaTestDrive{
  public static void main(String[]args){
    PizzaStore nyStore=new NYPizzaStore();
    Pizza pizza=nyStore.orderPizza("cheese");
    pizza.getName();
  }
}