package Stream.thread;

import java.util.concurrent.CountDownLatch;

public class ThreadManagement {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        MyRunnableLambda<CountDownLatch> runnable = new MyRunnableLambda<>(countDownLatch, cdl->{
           int s = 0;
           for (int i=0; i<1_000_000; i++){
               s += i;
           }
            System.out.println(Thread.currentThread().getName() + ": " + s);
            System.out.println(Thread.currentThread().getName() + ": finishid his work");
            cdl.countDown();
        });

        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread.start();
        thread2.start();
        thread3.start();
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName() + ":  All Thread finished his work");
    }
}
