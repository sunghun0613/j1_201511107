package com.j1.w11;

public class SimpleRemoteControl{
  Command slot;
  
  public SimpleRemoteControl(){}
  
  public void setCommand(Command command){
    slot = command;
  }
  public void buttonPressed(){
    slot.undo();
  }
}