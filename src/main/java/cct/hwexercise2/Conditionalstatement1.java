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



public class Conditionalstatement1 {

    public static void main(String[] args) {
        
        Scanner myKB = new Scanner(System.in);
        
        // The speed variable
        int speed;
        
        // Asking for a random speed
        System.out.println("write a speed here: ");
        
        // Using Try if the user write something like a simple word or letter
        try{
            // Using the keyboard to insert a speed
            speed = myKB.nextInt();
            
            //Conditional if - more than 60km is a fine!, and less it's ok
            if(speed >= 60){

                    System.out.println("the speed is more than 60, \nyou have a fine now");
            }else
                {
                    System.out.println("the speed is less than 60 \n But drive carefully");
                }
        // If the user write someting different to a number
        }catch(Exception e){
    
            System.out.println("this is not a speed ");
        }
    }
}
