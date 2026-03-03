/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.bai1giuaki;

/**
 *
 * @author panhh
 */
public class student {
    private String id;
    private String name;
    private double gpa;

public student (String id, String name, double gpa) {
    this.id =id;
    this.name=name;
    this.gpa=gpa;
}
public String getid(){
    return id;
}
public String getname(){
    return name;
}
public double getgpa(){
    return gpa;
}
public void setid(String id){
    this.id=id;
}
public void setname(String name){
    this.name=name;
}
public void setgpa(double gpa){
    if(gpa >=0&& gpa <=4){
    this.gpa=gpa;}else{
        System.out.println("Loi gpa");
    }
}
public String toString() {
    return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

