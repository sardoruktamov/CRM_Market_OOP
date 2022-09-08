package Stream.thread;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ThreadSafety {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        MyRunnableLambda<Vector<Integer>> myRunnableLambdaWithVector = new MyRunnableLambda<>(vector,(v)->{
            for (int i=0; i<1_000_000; i++){
                v.add(i);
            }
            System.out.println(Thread.currentThread().getName() + ": " + v.size());
        });

        Thread v1 = new Thread(myRunnableLambdaWithVector, "V birinchi");
        Thread v2 = new Thread(myRunnableLambdaWithVector, "V ikkinchi");
        Thread v3 = new Thread(myRunnableLambdaWithVector, "V uchinchi");
        Thread v4 = new Thread(myRunnableLambdaWithVector, "V turtinchi");

        v1.start();
        v2.start();
        v3.start();
        v4.start();

        ArrayList<Integer> arrayList = new ArrayList<>();
        MyRunnableLambda<ArrayList<Integer>> myRunnableLambdaWithArrayList = new MyRunnableLambda<>(arrayList,(al)->{
            for (int i=0; i<1_000_000; i++){

                al.add(i);
            }
            System.out.println(Thread.currentThread().getName() + ": " + al.size());
        });

        Thread a1 = new Thread(myRunnableLambdaWithArrayList, "A birinchi");
        Thread a2 = new Thread(myRunnableLambdaWithArrayList, "A ikkinchi");
        Thread a3 = new Thread(myRunnableLambdaWithArrayList, "A uchinchi");
        Thread a4 = new Thread(myRunnableLambdaWithArrayList, "A turtinchi");

        a1.start();
        a2.start();
        a3.start();
        a4.start();

        LinkedList<Integer> linkedList = new LinkedList<>();
        MyRunnableLambda<LinkedList<Integer>> myRunnableLambdaWithlinkedList = new MyRunnableLambda<>(linkedList,(ll)->{
            for (int i=0; i<1_000_000; i++){

                ll.add(i);
            }
            System.out.println(Thread.currentThread().getName() + ": " + ll.size());
        });

        Thread l1 = new Thread(myRunnableLambdaWithArrayList, "l birinchi");
        Thread l2 = new Thread(myRunnableLambdaWithArrayList, "l ikkinchi");

        l1.start();
        l2.start();


    }
}
