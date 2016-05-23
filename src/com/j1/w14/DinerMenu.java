package com.j1.w14;

public class DinerMenu{
  static final int MAX_ITEMS=3;
  int numberOfItems=0;
  MenuItem[] menuItems;
  public DinerMenu(){
    menuItems=new MenuItem[MAX_ITEMS];
    addItem("BLT","...",true,2.9);
    addItem("Vegetarian BLT","...",false,3.9);
    addItem("BLT","...",false,1.9);
  }
  public void addItem(String name, String description, boolean v, double p){
    MenuItem menuItem=new MenuItem(name, description,v,p);
    if(numberOfItems>=MAX_ITEMS){
      System.out.println("Error");
    }else{
      menuItems[numberOfItems]=menuItem;
      numberOfItems=numberOfItems+1;
    }
  }
  public MenuItem[] getMenuItems(){
    return menuItems;
  }
}