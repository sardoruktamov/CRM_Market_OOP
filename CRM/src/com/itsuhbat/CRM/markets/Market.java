package com.itsuhbat.CRM.markets;

import com.itsuhbat.CRM.products.Product;

public class Market {

    public String name;
    public String address;
    public Product[] products;
    public Double square;
    public String startTime="ish boshlash vaqti";
    public String endTime="ish tugash vaqti";

    public Market() {
    }

    public Market(String name, String address, Product[] products) {
        this.name = name;
        this.address = address;
        this.products = products;
    }

    public Market(String name, String address, Double square) {
        this.name = name;
        this.address = address;
        this.square = square;
    }

    public Market(String name, String address, Double square, String startTime, String endTime) {
        this.name = name;
        this.address = address;
        this.square = square;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return String.format("Nomi: %s \nManzili: %s \nHajmi: %.1f \nIsh boshlash vaqti: %s \nIsh tugash vaqti: %s ",
                name, address, square, startTime, endTime);
    }

    // %s -> string
    // %d -> butun sonlar (int, short, byte, long)
    // %f -> haqiqiy sonlar (float,double)
}
