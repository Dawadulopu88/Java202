/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {
       Scanner inp=new Scanner(System.in);
       int num1 = inp.nextInt();
       int num2 = inp.nextInt();
       int result = 2*(num1 + num2);
       int result2=num1*num2;
       System.out.println("Perimeter:");
       System.out.println(result);
       System.out.println("Area:");
       System.out.println(result2);
    }
    
}
