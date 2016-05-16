
package com.j1.w13;
import java.io.*;
public class TeaWithHook extends CaffeineBeverageWithHook{
  void brew(){
  System.out.println("brew");
  }
  void addCondiments(){
  System.out.println("+Lemon");
  }
  boolean customerWantsCondiments(){
    String answer= getUserInput();
    
    if(answer.toLowerCase().startsWith("y")) {
      return true;
    }
       else {
         return false;
       }
       }
  private String getUserInput() {
    String answer = null;
    
    System.out.print("Would u like Lemon?");
    
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try{
      answer = in.readLine();
    }catch(IOException ioe) {
      System.err.println("error");
    }
    if(answer ==null) {
      return "no";
    }
    return answer;
  }
}