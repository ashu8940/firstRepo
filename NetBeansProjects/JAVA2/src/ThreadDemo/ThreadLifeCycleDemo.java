package ThreadDemo;
 public class ThreadLifeCycleDemo extends Thread{
     public void run(){
         for (int i = 0; i < 10; i++) {
          try{
              Thread.sleep(500);
              System.out.println(i);
              System.out.println("is interrupted"+Thread.interrupted());
          }catch(InterruptedException e){
              System.out.println("interrupted by main");
              
          }   
         }
    
     }
     public static void main(String[] args) {
         System.out.println("main thread");
         System.out.println("main creating object of child class");
         ThreadLifeCycleDemo demo=new ThreadLifeCycleDemo();
         Thread thread=new Thread(demo);
         System.out.println("main invoking child thread");
         thread.start();
         try {
             Thread.sleep(2000);
             thread.interrupt();
         } catch (InterruptedException e) {
         e.printStackTrace();
         }
         System.out.println("main finised ");
     }
 }
