package com.j1.w14;

import java.util.ArrayList;
import java.util.Arrays;

public class DuckSortTestDrive{
  public static void main(String[]args){
    Duck[] ducks={
      new Duck("aaa",8),
      new Duck("bbb",2),
      new Duck("ccc",7),
      new Duck("ddd",2),
      new Duck("eee",10),
      new Duck("fff",2)
    };
    System.out.println("Before sorting:");
    display(ducks);
    
    Arrays.sort(ducks);
    
    
    System.out.println("After sorting:");
    display(ducks);
    Duck[] myDucks={new Duck("Sang",8),new Duck("Myung",2),new Duck("Uni",7)};
    Arrays.sort(myDucks, new DuckComparator()); 
    display(myDucks);
  }
  public static void display(Duck[] ducks){
    for(int i=0; i<ducks.length; i++){
      System.out.println(ducks[i]);
    }
  }
}