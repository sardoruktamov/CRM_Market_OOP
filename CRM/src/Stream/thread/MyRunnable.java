package Stream.thread;

public class MyRunnable<T> implements Runnable {

    public T data;

    public MyRunnable(T data) {
        this.data = data;
    }

    @Override
    public void run() {
        for (int i=0;i<100000; i++){
//            synchronized(this) {
                if (data instanceof StringBuffer){
                    ((StringBuffer) data).append(1);
                }else if (data instanceof StringBuilder){
                    synchronized(this) {
                        ((StringBuilder) data).append(1);
                    }
                }
//            }
        }
        String name = Thread.currentThread().getName();
        if (data instanceof StringBuffer){
            System.out.println(name +": "+ ((StringBuffer) data).length());
        }else if (data instanceof StringBuilder){
            System.out.println(name + ": "+ ((StringBuilder) data).length());
        }

    }
}
