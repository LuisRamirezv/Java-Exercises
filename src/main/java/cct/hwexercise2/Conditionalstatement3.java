/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cct.hwexercise2;

import java.util.Scanner;

/**
 * Write a Java program to get a number from the user and print whether 
 * it is positive or negative.
 * Test Data
 * Input number: 35
 * Expected Output :
 * Number is positive
 */


public class Conditionalstatement3 {
    
    public static void main(String[] args){
        
        Scanner myKB = new Scanner(System.in);
        
        int number;
        
        System.out.println("Write a number: ");
        
        try{
            number = myKB.nextInt();
        
            if(number >= 0){

                System.out.println("Number is positive");
            }
            else
            {
                System.out.println("Number is negative");
            }
        }catch(Exception e){
            
            System.out.println("This is not a number ! ");
        }
    }
}
