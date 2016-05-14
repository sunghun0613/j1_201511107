
package com.j1.w11;

public class LightOffCommand implements Command {
  private Light light;
  int level;
  public LightOffCommand(Light light) {
     this.light=light;
  }
  public void execute() {
    light.off();
 }
  public void undo() {
    light.dim(level);
  }
}