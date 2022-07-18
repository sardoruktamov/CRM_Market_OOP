package com.itsuhbat.CRM;

import com.itsuhbat.CRM.markets.Market;
import com.itsuhbat.CRM.personnel.Employee;
import com.itsuhbat.CRM.products.Product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Market market1 = new Market("Easy","Shayxontoxur tumani, Ganga", 80D, 1,2);
        market1.startTime = "09:00 dan";
        market1.endTime = "18:00 gacha";
//        Employee employee = new Employee("Sardor", 7, 30000D);





        Scanner scanner = new Scanner(System.in);
        int action;

        do {
            System.out.println(
                    "Menyuni tanlang: " +
                            "\n[1].Market ma'lumotlari " +
                            "\n[2].MAXSULOTLAR HAQIDA " +
                            "\n[3].XODIMLAR HAQIDA " +
                            "\n[0].Dasturni tugatish");
            action = scanner.nextInt();
            switch (action){
                case 1: System.out.println(market1); break;
                case 2: market1.selectProduct(); break;
                case 3: market1.selectEmployee(); break;
                case 0: System.exit(0);
            }
        }while (true);

    }

}
