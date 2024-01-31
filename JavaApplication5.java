/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

class Person {
    public String name;
    public String age;

public String Information(){
  
    return name; 
 } 

public String Information2(){
  
    return age; 
}
}

public class JavaApplication5{
    public static void main(String[] args) {
      Person person=new Person();
     
      person.name="Opu";
      person.age="21";
      
       System.out.println("Name:"+person.Information());
        System.out.println("Age:"+person.Information2());
    }
}
    
