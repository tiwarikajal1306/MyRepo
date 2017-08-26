package sleep;

/**
 * Created by Kajal on 26-08-2017.
 */
public class JoinDemo implements Runnable {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread"+Thread.currentThread().getName()+"="+i);
        }

    }
    public static void main(String args[]) throws InterruptedException
    {
        JoinDemo joinDemo=new JoinDemo();
        Thread t1=new Thread(joinDemo);
        Thread t2=new Thread(joinDemo);
        t1.start();
        t2.start();
        t1.join();
    }
}
