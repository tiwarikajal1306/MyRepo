package sleep;

import static java.lang.Thread.*;

/**
 * Created by Kajal on 26-08-2017.
 */
public class SleepDemo extends Thread
{
    public void run()
    {
        try {
            for (int i = 0; i < 10; i++)
            {
                System.out.println("Thread" + Thread.currentThread().getName() + "=" + i);
            }
            System.out.println("after sleep");
            Thread.sleep(500);
            System.out.println("Before sleep");
            Thread.sleep(1000);

        } catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
    public static void main (String args[]) {
SleepDemo p=new SleepDemo();
SleepDemo mm=new SleepDemo();
p.run();
mm.run();
p.start();
    }
}

