package com.itsuhbat.CRM.markets;

import com.itsuhbat.CRM.parts.Cash;
import com.itsuhbat.CRM.products.Product;

import java.util.Arrays;
import java.util.Scanner;

import static com.itsuhbat.CRM.helper.Config.scanner;

public class SuperMarket extends Market{
    Cash[] cashes;
    Product[] sales;
    Integer baskets;
    Integer usingBaskets;
    private Integer selesIndex;

    public void addProduct(){
        System.out.println("Maxsulot qo`shish turini tanlang: "+
                "\n[1].Skidkadagi maxsulotlarga qo`shish"+
                "\n[2].Hozirgi bor maxsulotlardan skidkaga o'tkazish"+
                "\n[3].Maxsulot qo'shish");

        int result = scanner.nextInt();
        switch (result) {
            //1.to`g`ridan to`g`ri skitkadagi maxsulotlarga yangi maxsulot qo`shish
            case 1:
                addSeles();break;
            //2.hozirgi bor productni skidkadagi productlarga o`tkazib qo`yish
            case 2:
                super.printProduct();
                System.out.println("Qaysi mahsulotga chegirma qilmoqchisiz? ");
                int res = scanner.nextInt();
                Product sale = super.delProduct(res);
                System.out.println("Necha foiz chegirma qilmoqchisiz? ");
                double percent = scanner.nextDouble();
                sale.setPrice(sale.getPrice() * (100D-percent) / 100D);
                addSeles(sale);
            //3.odatiy maxsulot qo`shish
            case 3:
                super.addProduct();break;
        }
    }

    public void addSeles(){
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

        if (selesIndex == sales.length){
            this.resizeArray();
        }
        sales[selesIndex++] = product;
        System.out.println(name+" ma`lumotlari muvoffaqiyatli qo`shildi"+"\n"+"*****************************************");
    }
    public void addSeles(Product product){
        if (selesIndex == sales.length){
           this.resizeArray();
        }
        sales[selesIndex++] = product;

    }

    public void resizeArray(){
        sales = Arrays.copyOf(sales,selesIndex*2);
    }


}
