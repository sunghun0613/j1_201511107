package com.j1.w11;

public class RemoteControlWithUndo{
  Command[] onCommands;
  Command[] offCommands;
  Command undoCommand;
  public RemoteControlWithUndo() {
    onCommands=new Command[7];
    offCommands=new Command[7];
    Command noCommand=new NoCommand();
    for(int i=0; i<7; i++) {
      onCommands[i]=null;
      offCommands[i]=null;
    }
    undoCommand=noCommand;
  }
  public void setCommand(int slot,Command onCommand, Command offCommand) {
    onCommands[slot]=onCommand;
    offCommands[slot]=offCommand;
  }
  public void onButtonWasPushed(int slot) {
    onCommands[slot].execute();
    undoCommand=onCommands[slot];
  }
  public void undoButtonWasPushed() {
    undoCommand.undo();
  }
  public void offButtonWasPushed(int slot) {
    onCommands[slot].execute();
    undoCommand=onCommands[slot];
  }
}