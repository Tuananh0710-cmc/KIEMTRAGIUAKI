/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.bai1giuaki;

/**
 *
 * @author panhh
 */
import java.util.ArrayList;
import java.util.List;

public class studentmanager<T> {

    
    private List<T> list;

    
    public  studentmanager() {
        list = new ArrayList<>();
    }

    
    public void add(T item) {
        list.add(item);
    }

     
    public List<T> getAll() {
        return list;
    }

}
