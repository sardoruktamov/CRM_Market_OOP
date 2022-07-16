package com.itsuhbat.CRM;

import com.itsuhbat.CRM.markets.Market;

public class Main {

    public static void main(String[] args) {
        Market market = new Market("Easy","Shayxontoxur tumani, Ganga", 80D);
        market.startTime = "09:00 dan";
        market.endTime = "18:00 gacha";
        System.out.println(market);

        System.out.println("***********************************");

        Market market2 = new Market(
                "Easy 2","Shayxontoxur 2 tumani, Ganga 2",
                50D, "08.00 dan", "17.00 gacha");
        System.out.println(market2);
    }

}
