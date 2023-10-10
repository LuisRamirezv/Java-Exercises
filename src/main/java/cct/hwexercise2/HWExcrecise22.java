/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cct.hwexercise2;

import java.util.Scanner;

/**
 * 3)	Create a program that will ask the user for a number and then output a 
 * message saying whether the number is ODD or EVEN. 
 * Reminder: modulus  % in Java. A number is EVEN if number % 2 equals 0
 */


/**
 *
 * @author PC-1
 */
public class HWExcrecise22 {
    
    public static void main(String[] args) {
    
        Scanner myKB = new Scanner(System.in);
        int number;
        
        try{
            System.out.println("Give me one number: ");
            number = myKB.nextInt();
            
            if((number %2) == 0){
                System.out.println("This is a ODD number");
            }
            
            else{
                System.out.println("This is a EVEN number");
            }
        }
            
        catch(Exception e){
                System.out.println("This is not a number!");
        }
    }
}
