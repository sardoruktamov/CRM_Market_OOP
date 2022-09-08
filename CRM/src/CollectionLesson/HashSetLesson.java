package CollectionLesson;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetLesson {
    public static void main(String[] args) {

        List<String> arraylist = new ArrayList<>();
        arraylist.add("salom");
        arraylist.add("ona");
        arraylist.add("vatan");
        arraylist.add("vatan");
//        System.out.println(arraylist);

        // Listdan Set ga o`tish usuli
//        Set<String> list = new HashSet<>();
        HashSet<String> list = new HashSet<>(arraylist);
        list.add("birinchi");
        list.add("ikkinchi");
        list.add("uchinchi");
        list.add("turtinchi");
        list.add("adasdasdsa");

        list.forEach(s -> {
            System.out.println(s);
        });

    }
}
