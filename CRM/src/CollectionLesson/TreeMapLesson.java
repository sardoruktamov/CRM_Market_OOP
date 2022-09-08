package CollectionLesson;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapLesson {
    public static void main(String[] args) {
        TreeMap<Integer, String> list = new TreeMap<>();
        list.put(1,"bir");
        list.put(2,"ikki");
        list.put(3,"uch");
        list.put(4,"turt");
        list.put(5,null);
//        list.put(null,"turt"); // TreeMap NULL qiymat ummuman saqlamaydi

        for (Map.Entry m: list.entrySet()
             ) {
            System.out.println(m.getKey()+" - "+m.getValue());
        }
    }
}
