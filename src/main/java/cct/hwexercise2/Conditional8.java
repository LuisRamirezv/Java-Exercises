/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cct.hwexercise2;

import java.util.Scanner;

/**
 * Write a Java program that reads two floating-point numbers and tests whether 
 * they are the same up to three decimal places. 
 * Test Data Input floating-point number: 25.586 Input floating-point another 
 * number: 25.589 Expected Output : They are different
 * 
 */

public class Conditional8 {
    
    public static void main(String[] args) {
        
        Scanner myKB = new Scanner(System.in);
        
        try{
              // Setting the first float
              System.out.println("Write the first number: ");
              float num1 = myKB.nextFloat();

              // Setting the second float
              System.out.println("Write the second number: ");
              float num2 = myKB.nextFloat();

              num1 = Math.round(num1*1000);
              num2 = Math.round(num2*1000);

              if(num1 == num2){

                  System.out.println("they are the same");

              }else if((num1 % 2 == 0)&&(num2 % 2 ==0)){

                  System.out.println("This is not a float number");

              }else
              {
                  System.out.println("They are different");
              }
                            
        }catch(Exception e){
            
            System.out.println("This is not a number!");
        }
    }
}
