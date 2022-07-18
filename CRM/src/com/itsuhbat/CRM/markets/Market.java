package com.itsuhbat.CRM.markets;

import com.itsuhbat.CRM.products.Product;

import java.util.Scanner;

public class Market {

    public String name;
    public String address;
    public Product[] products;
    public Double square;
    public String startTime="ish boshlash vaqti";
    public String endTime="ish tugash vaqti";
    // index of new insted product
    private int index;

    public Market() {
        products = new Product[10];
    }

    public Market(String name, String address, Product[] products) {
        this.name = name;
        this.address = address;
        this.products = products;
    }

    public Market(String name, String address, Double square, int prodectCount) {
        this.name = name;
        this.address = address;
        this.square = square;
        products = new Product[prodectCount];
    }

    public Market(String name, String address, Double square, String startTime, String endTime, int prodectCount) {
        this.name = name;
        this.address = address;
        this.square = square;
        this.startTime = startTime;
        this.endTime = endTime;
        products = new Product[prodectCount];
    }

    public void addProduct(){
        String name, type, unit;
        double price, amount;
        Scanner scanner = new Scanner(System.in);
        System.out.print("name: ");
        name = scanner.nextLine();
        System.out.print("type: ");
        type = scanner.nextLine();
        System.out.print("unit: ");
        unit = scanner.nextLine();
        System.out.print("amount: ");
        amount = scanner.nextDouble();
        System.out.print("price: ");
        price = scanner.nextDouble();

        Product product = new Product(name,price, type,amount,unit);

        if (index == products.length){
            resizeArray();
        }
        products[index++] = product;
    }
    public void resizeArray(){
        Product[] temp = new Product[products.length + 1];
        for (int i=0; i<products.length; i++){
            temp[i] = products[i];      //product qiymatlarini temp ga olib o`tyapmiz
        }
        products = temp;
    }

    public void printProduct(){
        for (int i=0; i<index; i++){
            System.out.println(i + 1 + " - " + products[i]);
        };
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
