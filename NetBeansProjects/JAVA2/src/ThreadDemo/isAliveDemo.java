package ThreadDemo;

public class isAliveDemo implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
             try {
            Thread.sleep(1000);
                 System.out.println("cihild- "+i);
        } catch (InterruptedException ex) {
            System.out.println("interrupted");
        }
    }
        System.out.println("from child thread:"+ Thread.currentThread());    
    }
    public static void main(String[] args) {
        isAliveDemo demo=new isAliveDemo();
        Thread thread= new Thread(demo);
        
        thread.start();
        
        try {
            for (int i = 0; i < 10; i++) {
                  System.out.println("Main-"+i);  
                   Thread.sleep(5000);
                System.out.println("is child alive in loop? "+thread.isAlive());
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
    }
        System.out.println("main finished ");
        System.out.println("from main threa: "+ Thread.currentThread().isAlive());
    }
}
    

