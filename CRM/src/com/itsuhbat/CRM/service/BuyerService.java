package com.itsuhbat.CRM.service;

import com.itsuhbat.CRM.markets.Market;
import com.itsuhbat.CRM.personnel.User;

import static com.itsuhbat.CRM.helper.Config.scanner;

public class BuyerService {
    private Market market;
    private User user;

    public BuyerService(Market market) {
        this.market = market;
    }

    public void start(){
        initUser();

        int action;

        do {
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
                    market.productId(id); break;
                }
                case 7:
                    System.out.println("hisobni to`ldirish");;
                case 0: System.exit(0);
            }
        }while (true);
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
}
