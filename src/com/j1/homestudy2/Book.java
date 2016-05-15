package com.j1.homestudy2;

public class Book{
  String description;
  public Book(String description){
    this.description=description;
  }
  public void open(){
    System.out.println(description+"-open the book");
  }
  public void close(){
    System.out.println(description+"-close the book");
  }
  public String toString(){
    return description;
  }
}