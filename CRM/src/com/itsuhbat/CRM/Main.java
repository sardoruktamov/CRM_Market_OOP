package com.itsuhbat.CRM;

import com.itsuhbat.CRM.markets.Market;
import com.itsuhbat.CRM.products.Product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Market market1 = new Market("Easy","Shayxontoxur tumani, Ganga", 80D, 1,2);
        market1.startTime = "09:00 dan";
        market1.endTime = "18:00 gacha";


        Scanner scanner = new Scanner(System.in);
        int action;

        do {
            System.out.println("Menyuni tanlang: \n[1].Mahsulot qo'shish \n[2].Mahsulotlar ro'yxati \n[3].Market ma'lumotlari \n[4].Employee qo'shish \n[5].Employee ro'yxati \n[0].Dasturni tugatish");
            action = scanner.nextInt();
            switch (action){
                case 1: market1.addProduct(); break;
                case 2: market1.printProduct(); break;
                case 3: System.out.println(market1); break;
                case 4: market1.addEmployee(); break;
                case 5: market1.printEmploees(); break;
                case 0: System.exit(0);
            }
        }while (true);

    }

}
