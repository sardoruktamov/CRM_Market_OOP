package com.itsuhbat.CRM;

import com.itsuhbat.CRM.markets.Market;
import com.itsuhbat.CRM.personnel.Employee;
import com.itsuhbat.CRM.products.Product;
import com.itsuhbat.CRM.service.Service;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Market market1 = new Market("Easy","Shayxontoxur tumani, Ganga",  80D, 1,2);
        market1.setStartTime("09:00 dan");
        market1.setEndTime("18:00 gacha");
//        Employee employee = new Employee("Sardor", 7, 30000D);


        Service service = new Service(market1);
        service.start();
        

    }

}
