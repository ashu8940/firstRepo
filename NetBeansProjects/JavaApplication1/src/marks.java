
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WIN-10
 */
public class marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  id, m1,m3, m2;
        double total;
        System.out.println("enter id");
        id=sc.nextInt();
        System.out.println("enter marsks of subject 1");
        m1=sc.nextInt();
        System.out.println("enter marsks of subject 2");
        m2=sc.nextInt();
        System.out.println("enter marsks of subject 3");
        m3=sc.nextInt();
        total=(m1+m2+m3)/3;
        if(total>50){
            System.out.println("welcome "+id);
            System.out.println("your total is "+ (m1+m2+m3) + "/500");
            System.out.println("passed");
        }
        else{
            System.out.println("your total is "+ (m1+m2+m3) + "/500");
            System.out.println("welcome "+id);
            System.out.println("failed");
            
        }       
        
        
        
    }
    
}
