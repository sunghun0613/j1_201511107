package com.j1.w12;

import java.util.*;

public class IteratorEnumerationTestDrive{
  public static void main(String[] args){
    ArrayList a=new ArrayList();
    Enumeration enumeration=new IteratorEnumeration(a.iterator());
    while (enumeration.hasMoreElements()) {
      System.out.println(enumeration.nextElement());
    }
  }
}