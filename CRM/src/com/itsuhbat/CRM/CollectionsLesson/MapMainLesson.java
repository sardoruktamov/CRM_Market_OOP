package com.itsuhbat.CRM.CollectionsLesson;

import java.util.*;

public class MapMainLesson {
    public static void main(String[] args) {
//        Map<String,String> map = Map.of(
//                "salom","hello",
//                "yangi", "new",
//                "olma", "apple",
//                "banan", "banana"
//        );
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("soz kiriting");
//        String a = scanner.nextLine();
//        String value = map.get(a);
//        if (value != null){
//            System.out.println("qiymat: "+value);
//        }else {
//            System.out.println("Bunday key yoq!");
//        }

        HashMap<Integer, String> numbers = new HashMap<>();
        numbers.put(1,"bir");
        numbers.put(2,"ikki");
        numbers.put(3,"uch");
        numbers.put(4,"tort");

        numbers.putIfAbsent(4,"four");          // agar 4 nomli key bo`lmasa qo`shish
        System.out.println(numbers);

        Collection<String> values = numbers.values();
        for (String val : values){
            System.out.println(val);
        }

        Set<Integer> keys = numbers.keySet();
        for (Integer key : keys){
            System.out.println(key);
        }

        Set<Map.Entry<Integer,String>> entries = numbers.entrySet();
        for (Map.Entry<Integer,String> entry : entries){
            System.out.println(entry.getKey() + " : "+entry.getValue());
        }








    }
}
