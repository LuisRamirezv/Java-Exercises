/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cct.hwexercise2;

import java.util.Scanner;

/**
 *
 * Write a Java program that takes three numbers from the user and prints the greatest number.
 * Test Data
 * Input the 1st number: 25
 * Input the 2nd number: 78
 * Input the 3rd number: 87
 * Expected Output :
 * The greatest: 87
 */
public class Conditional5 {
    
    public static void main(String[] args) {
        
        Scanner myKB = new Scanner(System.in);
        
        int a, b, c;
        
        System.out.println("Write tree numbers");
        
        try{
            //Input numbers
            System.out.println("First number: ");
            a = myKB.nextInt();
            
            System.out.println("Second number: ");
            b = myKB.nextInt();
            
            System.out.println("Third number: ");
            c = myKB.nextInt();
            
            if(a > b && a > c){
                
                System.out.println("The greatest: " + a);
            }
            else if(b > a && b > c){
                
                System.out.println("The greatest: " + b);
            }
            else{
                System.out.println("The greatest: " + c);
            }  
        }catch(Exception e){
            // Exception for different input
            System.out.println("This is not a number! ");
        }
        
    }
}
