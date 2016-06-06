package com.j1.address;

import java.util.ArrayList;
import java.util.List;

public class DataImp implements Datap {
 
   //list is working as a database
   List<Data> datas;

   public DataImp(){
      datas = new ArrayList<Data>();
      Data data1 = new Data("Robert",01043234532);
      Data data2 = new Data("John",01032452342);
      datas.add(data1);
      datas.add(data2);  
   }
   @Override
   public void deleteData(Data data) {
      datas.remove(data.getNumber());
      System.out.println("Data: number " + data.getNumber() + ", deleted from database");
   }

   //retrive list of students from the database
   @Override
   public List<Data> getAllDatas() {
      return datas;
   }

   @Override
   public Data getData(int number) {
      return datas.get(number);
   }

   @Override
   public void updateData(Data data) {
      datas.get(data.getNumber()).setName(data.getName());
      System.out.println("Student: number " + data.getNumber() + ", updated in the database");
   }
}