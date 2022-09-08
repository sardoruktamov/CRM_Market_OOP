package xatoliklar;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer integer = scanner.nextInt();
        try {
            System.out.println(isPrime(integer));
        }catch (NotPrimeNumberExceptions ex){
            System.err.println(ex.getMessage());
        }
    }

    public static boolean isPrime(Integer integ) throws NotPrimeNumberExceptions{
        for (int i=2;i<=Math.sqrt(integ);i++){
            if (integ%i==0) throw new NotPrimeNumberExceptions("Berilgan son tub emas!");
        }

        return  true;
    }
}
