package com.j1.w12_1;

public class HomeTheaterTestDrive{
  public static void main(String[] args){
    Amplifier amp= new Amplifier("My Amp");
    Tuner tuner = new Tuner("My Tuner",amp);
    DvdPlayer dvd = new DvdPlayer("My DVD",amp);
    Projector projector = new Projector("My Projector",dvd);
      
    HTFacade ht=new HTFacade(amp,tuner,dvd,projector);
    ht.watchMovie("My Movie Watching...");
    ht.endMovie();
  }
}