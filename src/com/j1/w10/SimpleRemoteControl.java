package com.j1.w10;

public class SimpleRemoteControl{
  Command slot;
  
  public SimpleRemoteControl(){}
  
  public void setCommand(Command command){
    slot = command;
  }
  public void buttonPressed(){
    slot.execute();
  }
}