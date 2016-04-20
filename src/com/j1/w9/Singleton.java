package com.j1.w9;

public class Singleton{
  private static Singleton uniqueInstance;
  //private static Singleton uniqueInstance = new Singleton();
  private static int numCalled=0;
  private Singleton(){}
  public static synchronized Singleton getInstance(){
    if(uniqueInstance==null){
      uniqueInstance=new Singleton();
    }
    numCalled++;
    System.out.println("numCalled: "+numCalled++);
    return uniqueInstance;
  }
}
