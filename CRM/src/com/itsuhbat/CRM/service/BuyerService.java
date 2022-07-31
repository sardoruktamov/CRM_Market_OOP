package com.itsuhbat.CRM.service;

public interface BuyerService {

    //xaridorga aloqador ma`lumotlarni tanlash menyusi
    void start();

    // xaridor ma'lumotlarini o`zgartirish
    void changeUserInfo();
    //xaridor ma`lumotini kiritish
    void initUser();

    void fillAccount();
};
