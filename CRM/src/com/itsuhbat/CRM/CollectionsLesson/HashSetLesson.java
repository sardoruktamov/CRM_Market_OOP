package com.itsuhbat.CRM.CollectionsLesson;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetLesson {
    public static void main(String[] args) {
        HashSet<String> hashSet =new HashSet();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i=0; i < n; i++){
            hashSet.add(scanner.nextLine());
        }

        //Setdan ma`lumot o`qish usullari
        //1-usul
        for(String s: hashSet){
            System.out.println(s + " 1-usul");
        }
        
        //2-usul
        Iterator<String> itr = hashSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.hasNext() + " 2-usul");
        }

        //3-usul
        hashSet.forEach(s -> {
            System.out.println(s + " 3-usul");
        });
    }
}
