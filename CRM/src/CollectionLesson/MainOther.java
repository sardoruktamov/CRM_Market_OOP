package CollectionLesson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class MainOther {
    public static void main(String[] args) {
        ArrayList miniarr = new ArrayList();
        miniarr.add("men");
        miniarr.add("sen");
        miniarr.add("ular");
        miniarr.add("bizlar");


        ArrayList list = new ArrayList(10);
//        LinkedList list = new LinkedList();
//        Vector list = new Vector(10);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(5);
        System.out.println(list);
        list.add(0,55);
        list.add(6,66);
        System.out.println(list);

        list.addAll(miniarr);
        System.out.println(list.get(0));
//        System.out.println(list.capacity());  // bu faqat Vectorda mavjut
        list.remove("men");
        System.out.println("men bormi: "+list.contains("men"));
        list.toString();
        System.out.println(list);
    }
}
