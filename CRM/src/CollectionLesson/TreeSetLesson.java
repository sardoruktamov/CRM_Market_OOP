package CollectionLesson;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetLesson {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(23);
        set.add(34);
        set.add(545);
        set.add(12);
        set.add(-12);
        set.add(0);
        // o'sish tartibida
        System.out.println(set);

        // kamayish tartibida
        System.out.println(set.descendingSet());

        HashSet<String> list = new HashSet<>();
        list.add("birinchi");
        list.add("ikkinchi");
        list.add("uchinchi");
        list.add("turtinchi");
        list.add("adasdasdsa");

        TreeSet<String> treeSet = new TreeSet<>(list);
//        System.out.println(treeSet);

        // ekranga chiqarish uchun malumotimizni Iteratrga aylantiramiz va foydalanamiz
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
