/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cct.hwexercise2;

import java.util.Scanner;

/**
 * 
 * Create a program that will ask the user for two numbers and then calculate 
 * the result of DIVIDING the first number by the second number (NB – this might
 * not be an integer!).
 */

/**
 *
 * @author PC-1
 */
public class HWExcecise21 {
    
    public static void main(String[] args) {
    
        Scanner myKB = new Scanner(System.in);
        
        float number1, number2;
        
        
        try{
            System.out.println("Write the first number: " + myName);
            number1 = myKB.nextFloat();
            System.out.println("Write the second number: ");
            number2 = myKB.nextFloat();
            System.out.println("");
            
            if(number1 == 0 || number2 == 0){
                
                System.out.println("Choose a number bigger than 0");
                
            }
            else{
                
                System.out.println("The new number is: " + number1/number2);
            }
        }
        catch(Exception e){
            
            System.out.println("This is not a number! ");
        }
    }
}
    
