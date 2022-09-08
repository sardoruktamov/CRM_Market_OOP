package fileLesson.homework.filewrite;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PolindiromeWords {
    private static Scanner scanner;

    static {
        File f= new File("./src/fileLesson/homework/filewrite/input3.txt");
        try {
            scanner = new Scanner(new FileInputStream(f));
        } catch (FileNotFoundException e) {
            System.err.println("===Bunday fayl topilmadi===");
        }
    }
    public static void main(String[] args) throws IOException {
        File out = new File("./src/fileLesson/homework/filewrite/output.txt");
        out.createNewFile();
        FileWriter fw = new FileWriter(out);

        String s = scanner.nextLine();
        String[] fields = s.split(",");

        List<StringBuffer> sbList = new ArrayList<>();
        List<String> revList = new ArrayList<>();

        // StringBuffer listiga qo`shish         [bir, ikki, uch, turt, aziza, non, xurmo, anor, kiyik]
        for (int i=0; i<fields.length;i++) {
            sbList.add(new StringBuffer(fields[i]));
        }

        // so`zlarni teskari qilib yangi listga o`tkazish              [rib, ikki, hcu, trut, aziza, non, omrux, rona, kiyik]
        for (int i=0; i<sbList.size();i++) {
            sbList.get(i).reverse();
            revList.add(new String(sbList.get(i)));
        }

        // fields va revList orasidan  polindirom so`zlarni tekshirish
        for (String w: fields){
            for (int i=0;i< revList.size();i++){
                if (w.equals(revList.get(i))){
                    fw.write(fields[i]+", ");
                }
            }
        }
        fw.close();
    }
}
