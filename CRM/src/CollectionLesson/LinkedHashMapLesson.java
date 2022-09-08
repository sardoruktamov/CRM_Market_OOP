package CollectionLesson;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapLesson {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> list = new LinkedHashMap<>();
        list.put("bir",1);
        list.put("ikki",2);
        list.put("uch",3);
        list.put(null,0);

        for(Map.Entry m : list.entrySet()){
            System.out.println(m.getKey()+" - "+m.getValue());
        }
    }
}
