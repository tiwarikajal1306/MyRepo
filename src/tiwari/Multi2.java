package tiwari;

/**
 * Created by Kajal on 24-08-2017.
 */
public class Multi2 implements Runnable {
    public void run() {
        System.out.println("thread is running");

    }
    public static void main(String[] args){
        Multi2 m2=new Multi2();
        Thread t1=new Thread(m2);
        t1.start();
    }
}
