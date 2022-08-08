package com.itsuhbat.CRM.service.impl;

import com.itsuhbat.CRM.markets.Market;
import com.itsuhbat.CRM.personnel.User;
import com.itsuhbat.CRM.products.Product;
import com.itsuhbat.CRM.service.BuyerService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static com.itsuhbat.CRM.helper.Config.scanner;

public class BuyerServiceImple implements BuyerService {
    private Market market;
    private User user;

    public BuyerServiceImple(Market market) {
        this.market = market;
    }

    public void start(){
        initUser();

        int action;

        while (true){
            System.out.println(
                    "Menyuni tanlang: " +
                            "\n[1].Shaxsiy ma'lumotlar " +
                            "\n[2].Shaxsiy ma'lumotlarni o'zgartirish " +
                            "\n[3].Market ma'lumotlari " +
                            "\n[4].Mahsulotlar ro'yxati " +
                            "\n[5].Mahsulotlar ketma-ketlikda chiqarish " +
                            "\n[6].Mahsulot sotib olish " +
                            "\n[7].Hisobni toldirish " +
                            "\n[0].Dasturni tugatish");
            action = scanner.nextInt();
            switch (action){
                case 1:
                    System.out.println(user); break;
                case 2: changeUserInfo(); break;
                case 3: market.marketInfo(); break;
                case 4: market.printProduct(); break;
                case 5: {
                    System.out.println("o'lchamini kiriting: ");
                    int size = scanner.nextInt();
                    market.printProduct(size); break;
                }
                case 6: {
                    System.out.println("Mahsulot nomerini kiriting: ");
                    int id = scanner.nextInt();
                    productId(id); break;
                }
                case 7:
                    fillAccount();break;
                case 0: System.exit(0);
            }
        }
    }

    public void changeUserInfo(){
        sikl:
        while (true){
            System.out.println(user);
            System.out.println("Qaysi ma'lumotni o'zgartirasiz? ");
            int result = scanner.nextInt();
            scanner.nextLine();

            switch (result){
                case 1:
                    System.out.println("Ismi qayta kiriting: ");
                    String firstName = scanner.nextLine();
                    user.setFirstName(firstName);
                    break;
                case 2:
                    System.out.println("Familyangizni qayta kiriting: ");
                    String lastName = scanner.nextLine();
                    user.setLastName(lastName);
                    break;
                case 3:
                    System.out.println("Pul miqdorini qayta kiriting: ");
                    Double account = scanner.nextDouble();
                    user.setAccount(account);
                    break;
                case 0: break sikl;
                default:
                    System.out.println("Noto'g'ri ma'lumot kiritdingiz! \n");break;
            }
        }
    }

    public void initUser(){
        System.out.println("Ismingizni kiriting: ");
        scanner.nextLine();
        String firstName = scanner.nextLine();
        System.out.println("Familyangizni kiriting: ");
        String lastName = scanner.nextLine();
        System.out.println("Xisob raqamdagi pulni kiriting: ");
        Double account = scanner.nextDouble();
        this.user = new User(firstName,lastName, account);
    }

    public void productId(int id){
        ArrayList<Product> products = market.getProducts();
//        Product[] products = market.getProducts();
        Product product = null;
        for (int i = 0; i< products.size(); i++){
            if (id == i+1) {
                product = products.get(i);
                break;
            }

        }
        if (product != null){
            System.out.println(product);
            System.out.println("mahsulot miqdorini kiriting?  ");
            double amountProduct = scanner.nextDouble();
            if (product.getAmount() < amountProduct){
                    System.out.printf(
                            "Omborda %.1f kg %s qolgan holos, barchasini sotib olasizmi. ha/yoq ? \n",
                            product.getAmount(), product.getName()
                    );
                    scanner.nextLine();
                    String res = scanner.nextLine();
                    if (res.equalsIgnoreCase("ha")){
                        if (user.getAccount() >= amountProduct*product.getPrice()){
                            user.setAccount(user.getAccount()-amountProduct*product.getPrice());
                            System.out.printf("Siz %.1f so'mlik %s sotib oldingiz! \n", amountProduct*product.getPrice(), product.getName());
                            product.setAmount(0d);
                            System.out.printf("Omborda %.1f kg %s qoldi! \n", product.getAmount(), product.getName());
                        }else System.out.println("Xisobingizdagi mablag; yetarli emas! ");

                    }
                }
            else {
                    System.out.printf(
                                "Omborda %.1f kg %s qolgan, haqiqatddan sotib olmoqchimisiz?  ha/yoq?\n",
                                product.getAmount(), product.getName()
                    );
                    scanner.nextLine();
                    String res = scanner.nextLine();
                    if (res.equalsIgnoreCase("ha")){
                        if (user.getAccount() >= amountProduct*product.getPrice()){
                            user.setAccount(user.getAccount()-amountProduct*product.getPrice());
                            System.out.printf("Siz %.1f so'mlik %s sotib oldingiz! \n", amountProduct*product.getPrice(), product.getName());
                            product.setAmount(product.getAmount()-amountProduct);
                            System.out.printf("Omborda %.1f kg %s qoldi! \n", product.getAmount(), product.getName());
                        }else System.out.println("Xisobingizdagi mablag; yetarli emas! ");

                    }else System.out.println("Sotib olishni bekor qildingiz!");

                }
        }
        else System.out.println("Buday ID Maxsulot mavjud emas! ");

    }

    @Override
    public void fillAccount() {
        System.out.println("Qo'shmoqchi bo`lgan summagizni kiriting:");
        double sum = scanner.nextDouble();
        user.setAccount(user.getAccount()+sum);
        System.out.println("Balansizgiz to'ldirildi");
    }
}
