/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;
import java.util.Scanner;
/**
 *
 * @author Plab5pc23
 */
public class EvenOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner inp = new Scanner(System.in);
       int num1 = inp.nextInt();
       if(num1%2==0){
            System.out.println("Even");
       }else{
            System.out.println("Odd");
       }
        // TODO code application logic here
    }
    
}
