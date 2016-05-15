package com.j1.homestudy2;

public class Pen{
  String description;
  public Pen(String description){
    this.description=description;
  }
  public void pick(){
    System.out.println(description+"-pick");
  }
  public void open(){
    System.out.println(description+"-open the cap");
  }
  public void close(){
    System.out.println(description+"-close the cap");
  }
  public void put(){
    System.out.println(description+"-put");
  }
}