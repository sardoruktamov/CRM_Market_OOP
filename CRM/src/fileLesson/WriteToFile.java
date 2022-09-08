package fileLesson;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        File out = new File("./src/fileLesson/new/faylgaozish.txt");
        out.createNewFile();

        // faylga yozishning 1-usuli   FileWriter
        FileWriter fw = new FileWriter(out, true);
//        fw.write("matn qismi");
//        fw.close();

        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("buffered writer");
        bw.newLine();
        bw.close();fw.close();

//        // faylga yozishning 2-usuli    FileOutputStream
//        FileOutputStream fos = new FileOutputStream(out, true);
//        fos.write(("" +
//                "\n matn qismi stream").getBytes());
//        fos.close();
//
//        // faylga yozishning 3-usuli    FileOutputStream
//        PrintStream printStream = new PrintStream(new FileOutputStream(out));
//        printStream.println("text println");
//        printStream.printf("%s orqali yozish","format");
//        printStream.close();

        Files.write(Paths.get("./src/fileLesson/new/faylgaozish.txt"), List.of("bir","ikki","uch"));

    }
}
