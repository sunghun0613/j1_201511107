package com.j1.w11;

public class LightOnCommand implements Command{
  private Light light;
  int level;
  public void undo(){
    light.dim(level);
  }
  public LightOnCommand(Light light) {
  this.light = light;
  }
 
  public void execute() {

  light.on();
  }
}