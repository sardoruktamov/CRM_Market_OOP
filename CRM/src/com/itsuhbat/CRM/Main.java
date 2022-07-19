package com.itsuhbat.CRM;

import com.itsuhbat.CRM.markets.Market;
import com.itsuhbat.CRM.personnel.Employee;
import com.itsuhbat.CRM.products.Product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Market market1 = new Market("Easy","Shayxontoxur tumani, Ganga", 80D, 1,2);
        market1.setStartTime("09:00 dan");
        market1.setEndTime("18:00 gacha");
//        Employee employee = new Employee("Sardor", 7, 30000D);

        Product[] products = new Product[]{
                new Product("olma", 4000d, "meva", 4d, "kg"),
                new Product("anor", 3000d, "meva", 4d, "kg"),
                new Product("nok", 4000d, "meva", 4d, "kg"),
                new Product("gosht", 7000d, "gosht", 4d, "kg"),
                new Product("shokolat", 5000d, "shirimlik", 4d, "kg"),
                new Product("banan", 6000d, "meva", 4d, "kg"),
                new Product("apelsin", 1000d, "meva", 4d, "kg"),
        };
        market1.setProducts(products);


        Scanner scanner = new Scanner(System.in);
        int action;

        do {
            System.out.println(
                    "Menyuni tanlang: " +
                            "\n[1].Market ma'lumotlari " +
                            "\n[2].MAXSULOTLAR HAQIDA " +
                            "\n[22].MAXSULOTLAR ketma ketlikda chiqarish " +
                            "\n[3].XODIMLAR HAQIDA " +
                            "\n[0].Dasturni tugatish");
            action = scanner.nextInt();
            switch (action){
                case 1: System.out.println(market1); break;
                case 2: market1.selectProduct(); break;
                case 22: {
                    System.out.println("o'lchamini kiriting: ");
                    int size = scanner.nextInt();
                    market1.printProduct(size); break;
                }
                case 3: market1.selectEmployee(); break;
                case 0: System.exit(0);
            }
        }while (true);

    }

}
