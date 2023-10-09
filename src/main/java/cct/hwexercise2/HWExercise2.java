/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cct.hwexercise2;

import java.util.Scanner;

/**
 *
 * @author PC-1
 */
public class HWExercise2 {

    public static void main(String[] args) {
        
        Scanner myKB = new Scanner(System.in);
        
        int number;
        
        System.out.println("Give me one number please: ");
        
        try{
        
            number = myKB.nextInt();
            System.out.println("Your number is " + number);
       }
        catch(Exception e){
        
            System.out.println("This is not number!!");
        }
    }
}
