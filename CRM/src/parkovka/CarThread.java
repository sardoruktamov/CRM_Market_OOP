package parkovka;

import java.util.Scanner;

public class CarThread extends Thread {
    private String car_name;
    private int car_code;
    private int time;

    public CarThread(String car_name, int code, int time){
        this.car_name = car_name;
        this.car_code = code;
        this.time = time;
    }

    public void run() {
        int sum = 0;

        System.out.println("moshina parkovkaga kirdi! ");
        try {
            // DASTURNI SOATDA TEKSHIRISH
//            Thread.sleep(time * 3600000);

            // test uchun sekunt da tekshirildi
            Thread.sleep(time * 1000);

            for(int i=0; i<time; i++){
                sum += 5000;
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("mashina chiqmoqda!!!! ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("kodni tekshiring: ");

        sikl:
        while (true) {
            int repeat_code = scanner.nextInt();
            if (repeat_code == car_code) {
                System.out.println("parkovka umumiy narxi:" + sum);
                break sikl;
            } else {
                System.out.println("Kodni xato kiritdingiz! Qayta kiriting: ");
            }
        }
    }
}
