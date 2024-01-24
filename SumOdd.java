/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;
import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {
   Scanner inp = new Scanner(System.in);
   System.out.println("How many Integers:");
  int num1 = inp.nextInt();
  int sum=0;
  for(int i=1;i<=num1;i++){
       int num2 = inp.nextInt();
       if(num2%2!=0){
           sum=sum+num2;
       }
  }
   System.out.println("The sum of odd integers:");
   System.out.println(sum);
    }
    
}
