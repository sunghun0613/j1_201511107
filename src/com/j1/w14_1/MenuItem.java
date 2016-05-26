package com.j1.w14_1;

public class MenuItem {
  String name;
  String description;
  boolean vegetarian;
  double price;
  
  public MenuItem(String n, String d, boolean v, double p) {
    this.name = n;
    this.description = d;
    this.vegetarian = v;
    this.price = p;
  }
  
  public String getName() {
    return name;
  }
  
  public String getDescription() {
    return description;
  }
}