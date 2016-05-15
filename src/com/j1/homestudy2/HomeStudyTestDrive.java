package com.j1.homestudy2;

public class HomeStudyTestDrive{
  public static void main(String[] args){
    StandLight stand= new StandLight("stand");
    Book book = new Book("book");
    Pen pen = new Pen("pen");
    Notebook notebook = new Notebook("notebook");
      
    HSFacade hs=new HSFacade(stand,book,pen,notebook);
    hs.startstudy("startstudy");
    hs.finish();
  }
}