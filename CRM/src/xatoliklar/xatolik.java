package xatoliklar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class xatolik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer a=1,b=1;

        try {
            System.out.println("a= ");
            a = in.nextInt();
            System.out.println("b= ");
            b = in.nextInt();
        }catch (InputMismatchException ex){
            System.out.println("String format kiritildi, qayta urunub koring!");
            main(args);
        }
        System.out.printf("%d/%d=%d",a,b,b/b);

    }
}
