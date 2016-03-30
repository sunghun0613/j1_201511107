package com.sd.turtle;

import ch.aplu.turtle.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class TurtleKeyListener extends Turtle{
  public TurtleKeyListener(){
      addKeyListener(new KeyAdapter(){
      public void keyPressed(KeyEvent e){
        int keyCode=e.getKeyCode();
        switch(keyCode){
          case KeyEvent.VK_W:
            setStatusText("forward 20");
            forward(20);
            break;
          case KeyEvent.VK_S:
            setStatusText("back 20");
            back(20);
            break;
          case KeyEvent.VK_A:
            setStatusText("left 20");
            left(20);
            break;
          case KeyEvent.VK_D:
            setStatusText("right 20");
            right(20);
            break;
          case KeyEvent.VK_Q:
            setStatusText("q pressed and exiting");
            break;
        }
      }
      });
        
  } 
}

public class TurtleKeyObserverMain2{
  public static void main(String[] args){
    TurtleKeyListener t =  new TurtleKeyListener();
    t.addStatusBar(20);
    t.setStatusText("Press any key!");
  }
}