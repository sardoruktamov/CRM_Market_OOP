package com.itsuhbat.CRM.service;

import com.itsuhbat.CRM.markets.Market;

import java.util.Scanner;

import static com.itsuhbat.CRM.helper.Config.scanner;

public class SellerService {
    private Market market;

    public SellerService(Market market) {
        this.market = market;
    }
    public SellerService() {

    }

    public void start(){
        int action;

        do {
            System.out.println(
                    "Menyuni tanlang: " +
                            "\n[1].Mahsulot qo'shish " +
                            "\n[2].Mahsulotlar ro'yxati " +
                            "\n[3].Mahsulotlar ketma-ketlikda chiqarish " +
                            "\n[4].Mahsulotni o'chirish " +
                            "\n[5].Market ma'lumotlari " +
                            "\n[6].Market ma'lumotlarini o'zgartirish " +
                            "\n[0].Dasturni tugatish"+"\n");
            action = scanner.nextInt();
            switch (action){
                case 1: market.addProduct(); break;
                case 2: market.printProduct(); break;
                case 3: {
                    System.out.println("o'lchamini kiriting: ");
                    int size = scanner.nextInt();
                    market.printProduct(size); break;
                }
                case 4: market.deleteProduct(); break;
                case 5: market.marketInfo(); break;
                case 6: this.changeMarketInfo(); break;
                case 0: System.exit(0);
            }
        }while (true);
    }

    //market maydonini o`zgartirish methodi
    public void changeMarketInfo(){

        sikle:
        while (true){
            System.out.println(market.toStringWithNumber());
            int action;
            System.out.println("Qaysi ma'lumotni o'zgartirmoqchisiz? \n[0].Orqaga");
            action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 1:
                    System.out.println("Market nomini kiriting: ");
                    String name = scanner.nextLine();
                    market.setName(name); break;
                case 2:
                    System.out.println("Market manzilini kiriting: ");
                    String address = scanner.nextLine();
                    market.setAddress(address); break;
                case 3:
                    System.out.println("Market maydonini kiriting: ");
                    Double square = scanner.nextDouble();
                    market.setSquare(square); break;
                case 4:
                    System.out.println("Ish boshlash vaqtini kiriting: ");
                    String startTime = scanner.nextLine();
                    market.setStartTime(startTime); break;
                case 5:
                    System.out.println("Ish tugash vaqtini kiriting: ");
                    String endTime = scanner.nextLine();
                    market.setEndTime(endTime); break;
                case 0: {
                    break sikle;
                }
            }
        }
    }
}
