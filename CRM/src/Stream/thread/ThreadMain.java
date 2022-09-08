package Stream.thread;

public class ThreadMain {
    public static void main(String[] args) {
        MyRunnable<StringBuilder> myRunnableSB=new MyRunnable<>(new StringBuilder());
        Thread sbThread = new Thread(myRunnableSB, "String Builder");
        Thread sbThread2 = new Thread(myRunnableSB, "String Builder");
        Thread sbThread3 = new Thread(myRunnableSB, "String Builder");
        Thread sbThread4 = new Thread(myRunnableSB, "String Builder");

        MyRunnable<StringBuffer> myRunnableSBF=new MyRunnable<>(new StringBuffer());
        Thread sbfThread = new Thread(myRunnableSB, "String Buffer");
        Thread sbfThread2 = new Thread(myRunnableSB, "String Buffer");
        Thread sbfThread3 = new Thread(myRunnableSB, "String Buffer");
        Thread sbfThread4 = new Thread(myRunnableSB, "String Buffer");

        sbThread.start();
        sbThread2.start();
        sbThread3.start();
        sbThread4.start();

        sbfThread.start();
        sbfThread2.start();
        sbfThread3.start();
        sbfThread4.start();
    }
}
