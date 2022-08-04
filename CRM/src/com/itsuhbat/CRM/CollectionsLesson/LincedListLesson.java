package com.itsuhbat.CRM.CollectionsLesson;

import java.util.ArrayList;
import java.util.LinkedList;

public class LincedListLesson {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
//        ll.add("birinchi");
//        ll.add("ikkinchi");
//        ll.add("uchunchi");
//        ll.add("turtinchi");
//        ll.add("beshinchi");

//        System.out.println(ll);
//        ll.addFirst("nolinchi");                           // birinchi elementga qo`hsish
//        System.out.println(ll.getFirst() +"   "+ ll.getLast());   // nolinchi   beshinchi
//        System.out.println(ll.pop());               // nolinchi nomli elementni o`chiradi va qaytaradi
//        System.out.println(ll.peek());              // birinchi elementni olib berish
//        System.out.println(ll.remove());        // list malumolarini ochiradi, agar list bosh bolsa xatolik beradi
//        System.out.println(ll.pop());        // list malumolarini ochiradi, agar list bosh bolsa NULL qaytaradi
//        System.out.println(ll.offerFirst("avvalgi"));  //true qaytaradi va birinchi elementga qo`shadi
//        System.out.println(ll.push());

        ArrayList<String> al = new ArrayList<>();

        Long startime = System.currentTimeMillis();
        for (int i=0; i<100000; i++){
            al.add(i+".");
        }
        Long endtime = System.currentTimeMillis();
        System.out.println(endtime-startime);

        Long startimel = System.currentTimeMillis();
        for (int i=0; i<100000; i++){
            ll.add(i+".");
        }
        Long endtimel = System.currentTimeMillis();
        System.out.println(endtimel-startimel);




        // umumiy qoshish     1.ArrayList  2.Lincedlist
        // boshiga qoshish     1.Lincedlist  2.ArrayList












    }
}
