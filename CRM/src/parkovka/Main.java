package parkovka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("mashina nomini kiriting: ");
        String car_name = scanner.nextLine();
        System.out.println("mashina kodini kiriting: ");
        int car_code = scanner.nextInt();
        System.out.println("parkovkada turish vaqtini (soatda) kiriting: ");
        int time = scanner.nextInt();

        CarThread carThread  = new CarThread(car_name,car_code, time);
        Thread thread = new Thread(carThread);
        thread.start();
    }
}