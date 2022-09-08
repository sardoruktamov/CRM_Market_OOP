package fileLesson.homework.filewrite;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TubSonlar {
    private static Scanner scanner;

    static {
        File f= new File("./src/fileLesson/homework/filewrite/input2.txt");
        try {
            scanner = new Scanner(new FileInputStream(f));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        File out = new File("./src/fileLesson/homework/filewrite/output.txt");
        out.createNewFile();
        FileWriter fw = new FileWriter(out);

        String s = scanner.nextLine();
        String[] fields = s.split(",");


        List<Integer> numberList  = new ArrayList();

        for (int i = 0; i < fields.length; i++) {
            numberList.add(Integer.valueOf(fields[i]));
        }

        int count = 0;
        for (int i = 0; i < numberList.size(); i++) {
            for (int d=1; d<=numberList.get(i);d++){
                if (numberList.get(i) % d == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.println(numberList.get(i));
                fw.write(fields[i]+" ");
            }
            count=0;
        }
        fw.close();
    }
}
