package javaMedium.MutiThread.train;

import com.sun.org.apache.xerces.internal.parsers.CachingParserPool;

/**
 * @author JonnyNan
 * @date 2018/10/26 - 13:42
 */
public class ThreadTrain1 implements Runnable {

    //总共有100张火车票
    private int train1Count = 100;

    private Object object = new Object();

    @Override
    public void run() {
        //为了模拟程序一直在抢票 while true
        while (train1Count > 0) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sale();
        }
    }

    public void sale() {
        synchronized (object) {
            if (train1Count > 0) {
                System.out.println(Thread.currentThread().getName() + ",出售第" + (100 - train1Count + 1) + "张票");
                train1Count--;
            }
        }

    }

    public static void main(String[] args) {
        ThreadTrain1 threadTrain1 = new ThreadTrain1();

        Thread t1 = new Thread(threadTrain1, "一号窗口");
        Thread t2 = new Thread(threadTrain1, "二号窗口");
        t1.start();
        t2.start();

    }
}
