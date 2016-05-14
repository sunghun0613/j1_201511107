package com.j1.w11;


public class Light{
  int level;
  public void on(){
	System.out.println("Light is of");
}
  public void off(){
  System.out.println("Light is off");
  }
  public void dim(int level){
    this.level=level;
    if(level==0){
      off();
    }else{
      System.out.println("Light is dimmed to " +level);
    }
  }

  public int getLevel(){
    return level;
  }
}
