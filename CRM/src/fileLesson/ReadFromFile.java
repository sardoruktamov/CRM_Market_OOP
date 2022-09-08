package fileLesson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
/**
        //1-usul o`qib olish  (qatorma qator o`qish)
        Scanner sc = new Scanner(new FileInputStream("./src/fileLesson/new/yangi.txt"));
        while (sc.hasNext()) {              // hasNext() faylda yana ma`lumot bor degani
            System.out.println(sc.nextLine());
        }

        //2-usul o`qib olish (bitta-bitta belgi orqali o`qish
        FileInputStream fis = new FileInputStream("./src/fileLesson/new/yangi.txt");
        int charakter = 0;
        while (charakter != -1){
            charakter = fis.read();
            System.out.println((char) charakter);
        }
        System.out.println("---------------------");
*/
//        3-usul bayt massiv orqali o`qib olish
        /**
        fis = new FileInputStream("./src/fileLesson/new/yangi.txt");
        byte[] buffer = new byte[8];
        int count = 0;
        do {
            count = fis.read(buffer);
            for (byte b: buffer){
                System.out.println((char) b);
            }
        }while (count != -1);

        System.out.println("---------------------");
        for (byte b: buffer){
            System.out.println((char) b);
        }
         */
/**
        //4-usul
        byte[] all = Files.readAllBytes(Path.of("./src/fileLesson/new/yangi.txt"));
//        System.out.println(new String(all));

        //5-usul
        List<String> lines = Files.readAllLines(Path.of("./src/fileLesson/new/yangi.txt"));
        System.out.println(lines);
        for (String l: lines){
            System.out.println("list bilan "+l);
        }
*/
    }
    private static void array(byte[] arr){
        arr[0] = 'n';
        arr[1] = 'i';
        arr[2] = 'm';
        arr[3] = 'a';
    }
}

// I/O  -input/output (kiritish/chiqarish)