/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadDemo;

public class timerDemo extends Thread {
   public void run(){  
       for (int i = 0; i < 5; i++) {
          try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
    System.out.println(i);  
  }    
       }
  
   
    public static void main(String[] args) {
        timerDemo t1=new timerDemo();  
      t1.start();  
    }
   
}
