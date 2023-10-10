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
        
        int number1, number2;
        
        try{
        
            System.out.println("Write the first number: ");
            number1 = myKB.nextInt();
            System.out.println("Write the second number: ");
            number2 = myKB.nextInt();
            System.out.println("");
        }
        catch(Exception e){
            
            System.out.println("This is not a number! ");
        }
    }
}
    
