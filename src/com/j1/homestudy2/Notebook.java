package com.j1.homestudy2;

public class Notebook{
  String description;
  public Notebook(String description){
    this.description=description;
  }
  public void on(){
    System.out.println(description+"-power on");
  }
  public void login(){
    System.out.println(description+"-log In");
  }
  public void open(){
    System.out.println(description+"-open data file");
  }
  public void close(){
    System.out.println(description+"-close data file");
  }
  public void logout(){
    System.out.println(description+"-log Out");
  }
  public void off(){
    System.out.println(description+"-power off");
  }
}