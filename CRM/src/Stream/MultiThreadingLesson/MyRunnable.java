package Stream.MultiThreadingLesson;

public class MyRunnable implements Runnable{

    // volatile - ma'lumotlarni kech xotirada ushlab qolmaslikni ta'minlaydi
    public int count = 0;

    public void run(){
        for (int i=0;i<100_0000; i++){
            synchronized(this) {
                count++;
            }
        }
        String name = Thread.currentThread().getName();
        System.out.println(name +": "+ count);
    }
}
