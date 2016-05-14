package com.j1.w12_1;

public class DvdPlayer {
    String description;
    Amplifier amplifier;
    String movie;
 
    public DvdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }
    public void on() {
        System.out.println(description + " on");
    }
    public void off() {
        System.out.println(description + " off");
    }
    public void eject() {
        movie = null;
        System.out.println(description + " eject");
    }
    public void play(String movie) {
        this.movie = movie;
        System.out.println(description + " play" + movie );
    }
    public void stop() {
        System.out.println(description + " stop" + movie);
    }
    public String toString() {
        return description;
    }
}