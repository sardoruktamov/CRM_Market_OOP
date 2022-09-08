package firstLesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
    private String name;
    private Double price;
    private String type;
    private Double amount;
    private String unit;        // o'lchov birligi


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
    public int hashCode(){
        return name.hashCode()+price.hashCode()+type.hashCode();

    }

    public boolean equals(Object o){
        if(o ==this)return true;

        if (o instanceof Product){
            Product obj = (Product) o;
            return name.equals(obj.name) && type.equals(obj.type) && price.equals(obj.price);
        }
        return false;
    }


//    public void productId(int id){
//        Product[] products = new Product[]{};
//
//        for (int i=0;i< products.length; i++){
//            if (i == id)
//                System.out.println(i  + " - " + products[i-1]);
//        };
//        System.out.print("omborda"+getAmount()+" kg "+getName()+" qolgan.");
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 2)
            this.name = name;
        else System.out.println("Uzunroq nom kiriting!");
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price > 100)
            this.price = price;
        else this.price = 100d;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.length() > 2)
            this.type = type;
        else System.out.println("Uzunroq nom kiriting!");
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        if (unit.length() > 0)
            this.unit = unit;

    }

    @Override
    public String toString() {
        return String.format("Maxsulot nomi: %s narxi: %.1f turi: %s miqdori: %.1f o`lchov birligi: %s ",
                name, price, type, amount, unit);
    }



}

