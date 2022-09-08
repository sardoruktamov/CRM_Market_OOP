package fileLesson.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadText2 {
    public static void main(String[] args) throws IOException {
        Map<Character, Integer> belgilar = new HashMap<>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("./src/fileLesson/homework/filewrite/input3.txt"));

        String line = bufferedReader.readLine();
        while (line != null){
            for (int i=0; i<line.length();i++){
                Integer num = belgilar.get(line.charAt(i));
                if (num != null){
                    belgilar.put(line.charAt(i),num + 1);
                }else {
                    belgilar.put(line.charAt(i), 1);
                }
            }
            line = bufferedReader.readLine();
        }
        System.out.println(belgilar);
    }
}
