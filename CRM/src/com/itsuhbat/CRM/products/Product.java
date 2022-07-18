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

    public Product() {
    }

    @Override
    public String toString() {
        return String.format("Maxsulot nomi: %s narxi: %.1f turi: %s miqdori: %.1f o`lchov birligi: %s ",
                name, price, type, amount, unit);
    }
}
