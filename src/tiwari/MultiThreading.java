package tiwari;

/**
 * Created by Kajal on 24-08-2017.
 */
public class MultiThreading extends Thread {
    public void run(){
        System.out.println("thread is running");

    }

    public static void main(String[] args) {
        MultiThreading b1=new MultiThreading();
        b1.start();
    }
}
