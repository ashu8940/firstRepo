/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadDemo;

/**
 *
 * @author ashut
 */
public class NewClass1 extends Thread {
    public void run(){
     for(int i=1;i<=5;i++){  
   try{  
    Thread.sleep(500);  
   }catch(Exception e){System.out.println(e);}  
  System.out.println(i);  
  }  
 }  
public static void main(String args[]){  
 NewClass1 t1=new NewClass1();  
 NewClass1 t2=new NewClass1();  
 NewClass1 t3=new NewClass1();  
 t1.start();  
 try{  
  t1.join(1500);  
 }catch(Exception e){System.out.println(e);}  
  
 t2.start();  
 t3.start();     
        
    }
}
