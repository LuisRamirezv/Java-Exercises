/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cct.hwexercise2;

import java.util.Scanner;

/**
 * Write a Java program that takes a number from the user and generates 
 * an integer between 1 and 7. It displays the weekday name.
 * Test Data Input number: 3 Expected Output : Wednesday
 * 
 */
public class Conditional7 {
    
    public static void main(String[] args) {
        
        Scanner myKB = new Scanner(System.in);        
        int n;
        
        System.out.println("Input a number between 1-7: ");
        
        try{
            
            n = myKB.nextInt();
            
            if(n == 1){
                
                System.out.println("Monday");
            }else if(n == 2){
                
                System.out.println("Tuesday");
            }else if(n == 3){
                
                System.out.println("Wednesday");
            }else if(n == 4){
                
                System.out.println("Thursday");
            }else if(n == 5){
                
                System.out.println("Friday");
            }else if(n == 6){
                
                System.out.println("Saturday");
            }else if(n == 7){
                
                System.out.println("Sunday");
            }
            else
            {
                System.out.println("Just a number between 1 and 7");
            }
        
        }catch(Exception e){
            System.out.println("This is not a number! ");
        }
    }
    
}
