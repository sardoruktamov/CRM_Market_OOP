package Stream.thread;

import java.util.function.Consumer;

public class MyRunnableLambda<T> implements Runnable {
    private T data;
    private Consumer<T> consumer;

    MyRunnableLambda(T data, Consumer<T> consumer){
        this.data = data;
        this.consumer = consumer;
    }


    @Override
    public void run() {
        consumer.accept(data);
    }
}
