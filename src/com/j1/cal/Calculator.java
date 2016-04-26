package com.j1.cal;
import java.util.Scanner;

class Calc{
  int plus(int a,int b){
    int res= a+b;
    return res;
  }
  int minus(int a,int b){
    int res= a-b;
    return res;
  }
  int multi(int a,int b){
    int res=a*b;
    return res;
  }
  int div(int a,int b){
    int res=a/b;
    return res;
  }
}

public class Calculator{
  public static void main(String [] args){
    Scanner n= new Scanner(System.in);
    System.out.println("operand1,operand2");
    int operand1=n.nextInt();
    int operand2=n.nextInt();
    int answer;
    Calc res = new Calc();
    if(operand1>99999999 || operand2>99999999){
      System.out.println("Error");
    }
    System.out.println("choose operation");
    char operation= n.next().charAt(0);
    if(operation=='+'){
      answer=res.plus(operand1, operand2);
      System.out.println(answer);
    }
    else if(operation=='-'){
      answer=res.minus(operand1, operand2);
      System.out.println(answer);
    }
    else if(operation=='*'){
      answer=res.multi(operand1, operand2);
      System.out.println(answer);
    }
    else if(operation=='/'){
      answer=res.div(operand1,operand2);
      System.out.println(answer);
    }
    else{
      System.out.println("Error");

    }
    
      
  }
}