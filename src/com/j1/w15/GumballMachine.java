package com.j1.w15;

public class GumballMachine{
  final static int SOLD_OUT=0;
  final static int NO_QUARTER=1;
  final static int HAS_QUARTER=2;
  final static int SOLD=3;
  
  int state=SOLD_OUT;
  
  int count=0;
  public GumballMachine(int count){
    this.count=count;
    if(count>0){
      state=NO_QUARTER;
    }
  }
  public void insertQuarter(){
    if(state==HAS_QUARTER){
      System.out.println("You can not insert another quarter");
    }
    else if(state==NO_QUARTER){
      state=HAS_QUARTER;
      System.out.println("You inserted another quarter");
    }
    else if(state==SOLD_OUT){
      System.out.println("You can not insert. SOLD_OUT");
    }
    else if(state==SOLD){
      System.out.println("wait. we have already given a gumball");
    }
  }
  public void ejectQuarter(){
    if(state==HAS_QUARTER){
      state= NO_QUARTER;
      System.out.println("Quarter returned");
    }
    else if(state==NO_QUARTER){
      state=HAS_QUARTER;
      System.out.println("You inserted another quarter");
    }
    else if(state==SOLD_OUT){
      System.out.println("You can not insert. SOLD_OUT");
    }
    else if(state==SOLD){
      System.out.println("wait. we have already given a gumball");
    }
  }
  public void turnCrank(){
    if(state==SOLD){
      System.out.println("wait. we have already given a gumball");
    }
    else if(state == NO_QUARTER){
      System.out.println("You inserted another quarter");
    }
    else if(state== SOLD_OUT){
      System.out.println("You can not insert. SOLD_OUT");
    }
    else if(state==HAS_QUARTER){
      System.out.println("Quarter returned");
      state=SOLD;
      dispense();
    }
  }
  public void dispense(){
  if(state==SOLD){
       System.out.print("A gumball comes rolling out the slot");
       count =count -1;
       if(count ==0) {
         System.out.println("Oops, out of gumballs!");
         state = SOLD_OUT;
       }
       else{
         state=NO_QUARTER;
       }
    }
       else if (state==NO_QUARTER){
       System.out.print("You need to pay first");
       }
       else if (state==SOLD_OUT){
       System.out.print("No gumball dispensed");
       }
         else if (state==HAS_QUARTER){
         System.out.print("No gumball dispensed");
         }
  
  }
  
}