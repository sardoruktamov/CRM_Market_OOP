package com.itsuhbat.CRM.service;

public interface Service {
    /**
     * final - xirgi, yakuniy qiyman
     * final kalit so'zini qo'llanilishi mumkin bolganlar:
     * field - o'zgaruvchiga yangi qiymat yuklab bo'lmaydi
     * method - override qilib bo'lmaydi
     * class - voris olib bo`lmaydi
     */

    /** interfeys ichida kod yozish mumkin (Java 8 dan keyin qoshilgan)
     * kod yozish uchun
     * defoult va
     * private keywordlaridan foydalanamiz
     */
    default void defoultMethod(){
        System.out.println("this is defoult method");
    }

    private void privateMethod(){
        System.out.println("this is private method");
    }


    void start();

    void initProduct();
}
