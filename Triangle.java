/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;
import java.util.Scanner;

/**
 *
 * @author Plab5pc23
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner inp=new Scanner(System.in);
          System.out.println("Length");
       int num1 = inp.nextInt();
        System.out.println("Base");
       int num2 = inp.nextInt();
        System.out.println("Height");
       int num3 = inp.nextInt();
       int result = (num1 + num2 + num3);
       double result2= (0.5*num2*num3);
       System.out.println("Perimeter:");
       System.out.println(result);
       System.out.println("Area:");
       System.out.println(result2);
        // TODO code application logic here
    }
    
}
