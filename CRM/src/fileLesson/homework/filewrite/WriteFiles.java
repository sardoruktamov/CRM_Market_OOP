package fileLesson.homework.filewrite;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteFiles {
    private static Scanner scanner;

    static {
        File f= new File("./src/fileLesson/homework/filewrite/input.txt");
        try {
            scanner = new Scanner(new FileInputStream(f));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        File out = new File("./src/fileLesson/homework/filewrite/output.txt");
        out.createNewFile();
        Character[] unlilar = new Character[]{'a','e','i','o','u'};

        String s = scanner.nextLine();
        String[] fields = s.split(" ");
        int count = 0;
        FileWriter fw = new FileWriter(out);


        for (int i = 0; i < fields.length; i++) {
            char soz[] = fields[i].toCharArray();
            for (int n = 0; n < unlilar.length; n++) {
                for (int j = 0; j < soz.length; j++) {
                  if (soz[j] == unlilar[n]){
                      count++;
                  }
                }

            }
            if (count>=3){
                System.out.println(fields[i]);
                fw.write(fields[i]+" ");
            }
            count = 0;
        }
        fw.close();
    }
}
