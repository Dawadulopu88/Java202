/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

 
class Circle {
public float radius;

 public double Area(){
    double result =3.1416*radius*radius;
    return result;
 } 
}

public class JavaApplication4{
    public static void main(String[] args) {
      Circle cirle1=new Circle();
      Circle cirle2=new Circle();
      cirle1.radius=3.0f;
      cirle2.radius=4.0f;
       System.out.println("Area of circle 1:"+cirle1.Area());
       System.out.println("Area of circle 2:"+cirle2.Area());
    }
    
}
