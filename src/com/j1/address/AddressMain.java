package com.j1.address;

public class AddressMain {
   public static void main(String[] args) {
      Datap datap = new DataImp();

      //print all student
      for (Data data : datap.getAllDatas()) {
         System.out.println("Data: [Number : " + data.getNumber() + ", Name : " + data.getName() + " ]");
      }


      //update student
      Data data =datap.getAllDatas().get(0);
      data.setName("Michael");
      datap.updateData(data);

      //get the student
      datap.getData(0);
      System.out.println("Data: [number : " + data.getNumber() + ", Name : " + data.getName() + " ]");  
   }
}