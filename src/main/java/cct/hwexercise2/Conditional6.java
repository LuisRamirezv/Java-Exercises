/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cct.hwexercise2;

import java.util.Scanner;

/**
 * Write a Java program that reads a floating-point number and prints "zero" 
 * if the number is zero. Otherwise, print "positive" or "negative". 
 * Add "small" if the absolute value of the number is less than 1, or 
 * "large" if it exceeds 1,000,000.
 * Test Data Input a number: 25 Expected Output : Input value: 25 Positive 
 * number
 * 
 */
public class Conditional6 {
    
    public static void main(String[] args) {
        
        Scanner myKB = new Scanner(System.in);
        
        float number;
        
        System.out.println("Input a number: ");
        
        try{
            number = myKB.nextFloat();
            
            if(number >=1){
                
                System.out.println("Input value: "+ number +"\nPositive number");
                
                    if(number >=1000000){
                        
                        System.out.println("Large");
                    }
            }else if(number <=-1){
                
                System.out.println("Input value: "+ number +"\nNegative number");
                
                if(number <1){
                    System.out.println("Small");
                }
            }else{
                
                System.out.println("Input value: zero");
            }
        
        }catch(Exception e){
            System.out.println("This is not a number! ");
        }
    }
}
