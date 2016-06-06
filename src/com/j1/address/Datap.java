package com.j1.address;

import java.util.List;

public interface Datap {
   public List<Data> getAllDatas();
   public Data getData(int number);
   public void updateData(Data data);
   public void deleteData(Data data);
}