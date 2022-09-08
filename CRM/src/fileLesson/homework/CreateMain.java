package fileLesson.homework;

import java.io.File;
import java.time.LocalDate;
import java.util.Date;

public class CreateMain {
    public static void main(String[] args) {

        LocalDate sana = LocalDate.now();
        System.out.println("asosiy sana: " + sana);
        System.out.println("getYear() sana: " + sana.getYear());
        System.out.println("getMonthValue() sana: " + sana.getMonthValue());
        System.out.println("getDayOfMonth() sana: " + sana.getDayOfMonth());
        System.out.println("----------------------------------------------");
        int year = sana.getYear();
        int month = sana.getMonthValue();
        int day = sana.getDayOfMonth();
//        File createdFile = new File("./src/fileLesson/new");

        String path = String.format("./src/fileLesson/homework/uploads/%d/%d/%d", year, month, day);
        System.out.println("papka joylashgan manzil: " + path);


        File createFolder3 = new File("./src/fileLesson/homework/uploads/"
                +String.valueOf(year)+
                "/"+ String.valueOf(month)+
                "/"+ String.valueOf(day));

        if (createFolder3.mkdirs()){
            System.out.println("3-Papka yaratilindi!!!!!!!!!!");
        }else {
            System.out.println("3-Papka avvaldan mavjud");
        }




    }
}
