package com.j1.w7;
public abstract class Pizza{
  String name;
  void prepare(){
    System.out.println("Preparing"+name);
  }
  void bake(){
    System.out.println("Baking...");
  }
  void cut(){
    System.out.println("cutting...");
  }
  void box(){
    System.out.println("cutting...");
  }
  public String getName(){
    return name;
  }
}