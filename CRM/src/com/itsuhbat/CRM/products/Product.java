package com.itsuhbat.CRM.products;

import java.util.Scanner;

public class Product {
    String name;
    Double price;
    String type;
    Double amount;
    String unit;        // o'lchov birligi


    public Product(String name, Double price, String type, Double amount, String unit) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.amount = amount;
        this.unit = unit;
    }
    public String addNewProduct(){
        return toString();
    }

    @Override
    public String toString() {
        return String.format("Maxsulot nomi: %s \nnarxi: %.1f \nturi: %s \nmiqdori: %.1f \no`lchov birligi: %s ",
                name, price, type, amount, unit);
    }
}
