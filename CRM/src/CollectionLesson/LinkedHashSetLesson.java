package CollectionLesson;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetLesson {
    public static void main(String[] args) {
        Set<String> list = new LinkedHashSet<>();
        list.add("birinchi");
        list.add("ikkinchi");
        list.add("uchinchi");
        list.add("turtinchi");
        list.add("adasdasdsa");
        System.out.println(list);
        for (String str:list){
            System.out.println(str);
        }

    }
}
