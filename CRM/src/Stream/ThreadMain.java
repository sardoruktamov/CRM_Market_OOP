package Stream;

public class ThreadMain {
    public static void main(String[] args) {
        /**
         * 1. Thread konstruktoriga lambda expressions berish
         */

        //1-usul
        Runnable runnable = () -> {
            for (int i=0; i<10; i++){
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    throw new RuntimeException();
                }
                System.out.println(0);
            }
        };

        Thread threadEx = new Thread(runnable);
        threadEx.start();

        // 2-usul
        long s=0;
        Thread thread = new Thread(() -> {
            long ss = 0;
            for (int i=0; i<1000_000_000; i++){
                for (int j=0; j<1000_000_000; j++){
                    ss += i*j;
                }
                System.out.println("secont: "+ ss);
            }
        });

        thread.start();

        // main threadni ishga tushiradi
        for (int i=0; i<1000_000_000; i++){
            for (int j=0; j<1000_000_000; j++){
                s += (long) i*j;
            }
            System.out.println("first: "+s);
        }
    }
}
