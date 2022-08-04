package com.itsuhbat.CRM.CollectionsLesson;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLesson {
    public static void main(String[] args) {
        List<Integer> list = List.of(34,1,4,5,6,4,3,7,8,34,5,78,56,12,435,6);
        ArrayList<Integer> arrayList = new ArrayList<>(list);
//        for (int i=0;i<20;i++){
//            arrayList.add(i);
//        }

        System.out.println(arrayList.get(5)); // 5-indeksli elementni olib beradi
        System.out.println(arrayList.remove(0));  // 0-indeksli elementni o`chiradi
        System.out.println(arrayList.contains(78));     // royxatda 78 elementi borligini tekshiradi, agar bo`lsa true aks holda false qaytaradi
        System.out.println(arrayList.size());           // royxatni elementlar sonini qaytaradi
        System.out.println(arrayList.isEmpty());        // royxat bo`sh bo`lsa true aks holda false qaytaradi
        System.out.println(arrayList.indexOf(435));     // royxatdagi elementni nechanchi indexda ekanini qaytaradi
        System.out.println("removeIf >> "+arrayList.removeIf(i -> i%2==0));  //royxatdagi elementlarni o`chirishda shart berish
        System.out.println(arrayList);
        System.out.println(arrayList.removeAll(List.of(1,5,435)));  // 1,5,435 elemenrlari royxatda ham bolsa o`chiradi

    }
}
