/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cct.hwexercise2;

import java.util.Scanner;

/**
 * 
 *  1) Create a program that will ask the user for two numbers (separately!) as input 
 *  and then output a message telling them which number was bigger OR if they were the same.
 */

/**
 *
 * @author PC-1
 */
public class HWExercise2 {

    public static void main(String[] args) {
        
        Scanner myKB = new Scanner(System.in);
        
        int num1, num2;

        try{
            System.out.println("Give me the first number: ");
            num1 = myKB.nextInt();
            System.out.println("Give me the second number: ");
            num2 = myKB.nextInt();
            
            if(num1 > num2){
                
                System.out.println("The number " + num1 + " is bigger than " + num2);
            }
            else if(num1 == num2){
                System.out.println("Both numbers are equal");
            }
            else{
                System.out.println("The number " + num2 + " is bigger than " + num1);
            }
       }
        catch(Exception e){
        
            System.out.println("This is not number!!");
        }
    }
}
