/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author WIN-10
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
        double  salray;      
         System.out.println("enter hourly salray ");
          salray=sc.nextDouble();
         if (salray==17.9) {
             System.out.println("grater ");
            }
          else{
             System.out.println("lesser");
         }  
         
    }
    
    
}
