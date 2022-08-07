package com.itsuhbat.CRM.service.impl;

import com.itsuhbat.CRM.markets.Market;
import com.itsuhbat.CRM.products.Product;
import com.itsuhbat.CRM.service.Service;

import java.util.ArrayList;
import java.util.List;

import static com.itsuhbat.CRM.helper.Config.scanner;

public class ServiceImple implements Service {
    private Market market;

    public ServiceImple(){

    }
    public ServiceImple(Market market) {
        this.market = market;
        initProduct();
    }
     public void start(){
        while (true){
            System.out.println("Qanday foydalanuvchisiz? \n[1].Haridor \n[2].Sotuvchi \n[0].Dasturni to'xtatish");
            int result = scanner.nextInt();
            if (result == 1){
                BuyerServiceImple buyer = new BuyerServiceImple(market);
                buyer.start();break;

            }else if (result == 2){
                SellerServiceImple seller = new SellerServiceImple(market);
                seller.start();
                break;
            }else if (result == 0){
                System.exit(0);
                break;
            }
            System.out.println("Noto'g'ri ma'lumot kiritildi!");
        }
     }

     public void initProduct(){

         List<Product> lp = List.of(new Product("olma", 4000d, "meva", 14d, "kg"),
                 new Product("anor", 3000d, "meva", 5d, "kg"),
                 new Product("nok", 4000d, "meva", 6d, "kg"),
                 new Product("gosht", 7000d, "gosht", 14d, "kg"),
                 new Product("shokolat", 5000d, "shirimlik", 54d, "kg"),
                 new Product("banan", 6000d, "meva", 43d, "kg"),
                 new Product("apelsin", 1000d, "meva", 64d, "kg"));

         ArrayList<Product> list = new ArrayList<>();
         market.setProducts(list);
     }

}
