package com.itsuhbat.CRM;

import com.itsuhbat.CRM.markets.Market;
import com.itsuhbat.CRM.products.Product;

public class Main {

    public static void main(String[] args) {
        Market market = new Market("Easy","Shayxontoxur tumani, Ganga", 80D);
        market.startTime = "09:00 dan";
        market.endTime = "18:00 gacha";
        System.out.println(market);

        System.out.println("***********************************");
        Product product = new Product("Shakar", 20000D, "shirinlik", 2D, "kg");
        System.out.println(product);

        System.out.println(market.products);

    }

}
