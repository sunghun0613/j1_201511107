package com.j1.w14;

import java.util.ArrayList;

public class PancakeHouseMenu{
  //static final int MAX_ITEMS=3;
  //int numberOfItems=0;
  //MenuItem[] menuItems;
  ArrayList menuItems;
  public PancakeHouseMenu(){
    //menuItems=new MenuItem[MAX_ITEMS];
    menuItems=new ArrayList();
    addItem("BLT","...",true,2.9);
    addItem("Vegetarian BLT","...",false,3.9);
    addItem("BLT","...",false,1.9);
  }
  public void addItem(String name, String description, boolean v, double p){
    MenuItem menuItem=new MenuItem(name, description,v,p);
    //if(numberOfItems>=MAX_ITEMS){
    //  System.out.println("Error");
    //}else{
      //menuItems[0]=menuItem;
      //numberOfItems=numberOfItems+1;
    //}
    menuItems.add(menuItem);
  }
  public ArrayList getMenuItems() {
        return menuItems;
    }
   public String toString() {
        return "Objectville Pancake House Menu";
    }
}