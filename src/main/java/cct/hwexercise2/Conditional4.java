/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cct.hwexercise2;

import java.util.Scanner;

/**
 *
 * Write a Java program to solve quadratic equations (use if, else if and else).
 * Test Data
 * Input a: 1
 * Input b: 5
 * Input c: 1
 * Expected Output :
 * The roots are -0.20871215252208009 and -4.7912878474779195 
 */

public class Conditional4 {
    
    public static void main(String[] args){
    
        Scanner myKB = new Scanner(System.in);
        
        int a, b, c;

        try{
            //Giving the value for A
            System.out.println("Write the first number A: ");
            a = myKB.nextInt();
            
            //Giving the value for B
            System.out.println("Write the first number B: ");
            b = myKB.nextInt();
            
            //Giving the value for C
            System.out.println("Write the first number C: ");
            c = myKB.nextInt();
            
            if(((b*b) - (4*a*c)) > 0){
                
                // Set the equation
                double numero = (b*b-(4*a*c));
                // Set the root
                double root = Math.sqrt(numero);
                // Set the function
                double cuadraticpos = ((-b+root)/2*a);
                double cuadraticneg = ((-b-root)/2*a);
                
                System.out.println("The roots are " + cuadraticpos + " and " + cuadraticneg);
            
            }
            else if(((b*b) - (4*a*c)) == 0){
            
                // Set the function
                double cuadratic = (-b/(2*a));
                System.out.println("The root is " + cuadratic );
            }else
            {
                System.out.println("The equation has no real roots.");
            }
        }catch(Exception e){
            
            System.out.println("No es un numero !");
        }
    }  
}
