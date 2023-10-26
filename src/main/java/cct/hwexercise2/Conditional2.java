/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cct.hwexercise2;

import java.util.Scanner;

/**
 *
 * @author PC-1
 */
public class Conditional2 {
    
    public static void main(String[] args) {
        
        Scanner myKB = new Scanner(System.in);
        
        // Light trafic exercise
        
        String light;
        
        System.out.println("Giveme one colour between Red, Yellow or Green: ");
        
        
            light = myKB.nextLine();
            
            if(light.equalsIgnoreCase("green") == true){
                System.out.println("GO");
            }
            else if(light.equalsIgnoreCase("yellow") == true){
                System.out.println("Precaution");
            }
            else if(light.equalsIgnoreCase("red") == true){
                System.out.println("STOP");
            }
            else
            {
                System.out.println("This is not a Colour !");
            }
    }  
}
