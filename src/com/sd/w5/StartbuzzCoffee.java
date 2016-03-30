package com.sd.w5;

abstract class Beverage {
  String description="Unknown berverage";
  public String getDescription() {
    return  description;
  }
  public abstract double cost();
}

class Espresso extends Beverage {
  public Espresso() {
    description="Espresso";
  }
  public double cost() {
    return .99;
  }
}


class DarkRost extends Beverage {
  public DarkRost() {
    description="Dark Rost Coffee";
  }
  public double cost() {
    return .99;
  }
}


abstract class  CondimentDecortator extends Beverage {
 public abstract String getDescription();
}

class Mocha extends CondimentDecortator {
  Beverage beverage;
  public Mocha(Beverage b) {
    beverage=b;
  }
  public String getDescription() {
    return beverage.getDescription()+",Mocha";
}
  public double cost() {
    return beverage.cost() + .20;
  }
}
class Whip extends  CondimentDecortator {
  Beverage beverage;
  public Whip(Beverage b) {
        beverage=b;
    }
  public String getDescription(){
  return beverage.getDescription() + ".Whip";
}
public double cost() {
    return beverage.cost() +.10;
  }
}

class StarbuzzCoffee {
  public static void main(String args[]) {
    Beverage b= new DarkRost();
    
    Beverage md= new Mocha(b);
    Beverage wmd= new Whip(md);
   // Beverage wmd=new Whip(new Mocha(new DarkRost()));
    System.out.println(wmd.getDescription());
    System.out.println(wmd.cost());
  
  }
}