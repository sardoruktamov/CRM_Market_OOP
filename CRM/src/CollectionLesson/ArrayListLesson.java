package CollectionLesson;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLesson {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//
//        list.add("birinchi");
//        list.add("ikkinchi");
//        list.add("uchinchi");
//        list.add("turtinchi");
//        list.add("adasdasdsa");
//        list.remove("adasdasdsa");
//        System.out.println(list);
//
//        Collections.sort(list);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        ArrayList<Student> list = new ArrayList<>();
        Student student = new Student(1L, "testname", "test lastname");
        Student student1 = new Student(2L, "testname1", "test lastname1");
        Student student2 = new Student(3L, "testname2", "test lastname2");
        list.add(student);
        list.add(student1);
        list.add(student2);

        list.forEach(item -> {
            System.out.println(item.getId());
            System.out.println(item.getName());
            System.out.println(item.getLastname());
        });
    }
}
