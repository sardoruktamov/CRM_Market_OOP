package fileLesson.homework;

import java.util.Scanner;

public class ParseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Malumot kiriting: ");
        String words = scanner.nextLine();
        String newStringNumber = "";
        String newWord = "";
        try{
            int number = Integer.parseInt(words);
            System.out.println(number);
        }
        catch (NumberFormatException ex){
            System.err.println("==========");
            for (int i=0; i<words.length();i++){
                if (words.charAt(i) == '1' || words.charAt(i) == '2'  || words.charAt(i) == '3'  ||
                        words.charAt(i) == '4' || words.charAt(i) == '5' || words.charAt(i) == '6' ||
                        words.charAt(i) == '7' || words.charAt(i) == '8' || words.charAt(i) == '9' ||
                        words.charAt(i) == '0'){

                    newStringNumber += words.charAt(i);

                }else {
                    newWord += words.charAt(i);
                }
            }
        }

        int NewNumber = Integer.parseInt(newStringNumber);
        System.out.println("matndagi raqamlar: "+ NewNumber);
        System.out.println("matn qismi: "+ newWord);
    }
}
