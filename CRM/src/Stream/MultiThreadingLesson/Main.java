package Stream.MultiThreadingLesson;

public class Main {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();

        Thread first = new Thread(runnable,"first");
        Thread secont = new Thread(runnable,"secont");
        Thread third = new Thread(runnable,"third");
        Thread fourth = new Thread(runnable,"fourth");

        first.start();
        secont.start();
        third.start();
        fourth.start();
    }
}
