package com.itsuhbat.CRM;

import com.itsuhbat.CRM.markets.Market;
import com.itsuhbat.CRM.products.Product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Market market1 = new Market("Easy","Shayxontoxur tumani, Ganga", 80D, 1);
        market1.startTime = "09:00 dan";
        market1.endTime = "18:00 gacha";


        Scanner scanner = new Scanner(System.in);
        int action;

        do {
            System.out.println("Menyuni tanlang: \n1.Mahsulot qo'shish \n2.Mahsulotlar ro'yxati \n3.Market ma'lumotlari \n0.Dasturni tugatish");
            action = scanner.nextInt();
            switch (action){
                case 1: market1.addProduct(); break;
                case 2: market1.printProduct(); break;
                case 3: System.out.println(market1); break;
                case 0: System.exit(0);
            }
        }while (true);

    }

}
