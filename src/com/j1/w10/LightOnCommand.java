package com.j1.w10;

public class LightOnCommand implements Command{
  Light light;
  
  public LightOnCommand(Light light){
    this.light=light;
  }
  public void execute(){
    light.on();
  }
}