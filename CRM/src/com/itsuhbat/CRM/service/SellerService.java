package com.itsuhbat.CRM.service;

import com.itsuhbat.CRM.markets.Market;

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
                case 6: market.changeMarketInfo(); break;
                case 0: System.exit(0);
            }
        }while (true);
    }
}
