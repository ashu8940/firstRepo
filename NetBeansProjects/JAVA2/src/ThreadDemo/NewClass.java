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
public class NewClass implements Runnable {
    public void run(){
        System.out.println("thread running");
    }
    public static void main(String[] args) {
        NewClass m1 = new NewClass();
        Thread t1=new Thread(m1);
        t1.start();
    }
            
}
