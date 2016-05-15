package com.j1.homestudy2;

public class StandLight{
  String description;
  public StandLight(String description){
    this.description=description;
  }
  public void on(){
    System.out.println(description+"-light on");
  }
  public void off(){
    System.out.println(description+"-light off");
  }
  public String toString(){
    return description;
  }
}