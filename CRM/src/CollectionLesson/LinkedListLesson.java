package CollectionLesson;

import java.util.LinkedList;

public class LinkedListLesson {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("birinchi");
        list.add("ikkinchi");
        list.add("uchinchi");
        list.add("turtinchi");
        list.add("adasdasdsa");

//        list.forEach(s -> {
//            System.out.println(s);
//        });
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
