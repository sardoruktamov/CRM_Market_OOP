package CollectionLesson;

import java.util.HashMap;
import java.util.Map;

public class HashMapLesson {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "bir");
        hashMap.put(2, "ikki");
        hashMap.put(2, "ikkie");
        hashMap.put(null, "test");

        for(Map.Entry m: hashMap.entrySet()){
            System.out.println("key "+m.getKey()+"\n"+"value "+m.getValue());
        }
    }
}
