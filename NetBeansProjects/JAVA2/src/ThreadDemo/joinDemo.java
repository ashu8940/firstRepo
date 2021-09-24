
package ThreadDemo;

import java.util.logging.Level;
import java.util.logging.Logger;


public class joinDemo implements  Runnable{

    @Override
    public void run() {
        System.out.println("is chlid alive? "+Thread.currentThread().isAlive());
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+ "- "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    
    
    }
    public static void main(String[] args) {
        System.out.println("from main");
   Thread thread1 =new Thread(new joinDemo());
   Thread thread2 =new Thread(new joinDemo());
   
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println();
        thread2.start();
        System.out.println();
   System.out.println("is chlid alive? "+thread1.isAlive());
        System.out.println("main finished");
   
   
    }
 
}
    

