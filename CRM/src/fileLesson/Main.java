package fileLesson;

import Stream.sender_receiver.Data;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        File file = new File("F:\\WEB\\VIDEODARSLAR\\Javadan Videodarslar\\ITSuhbat\\Projects\\hello\\src\\fileLesson\\lesson.txt");
        System.out.println("getName() - " + file.getName());
        System.out.println("getParent() - " + file.getParent());
        System.out.println(file.isDirectory() ? "bu papka" : "bu fayl");

        File createdFile = new File("./src/fileLesson/new");

        if (createdFile.mkdir()){
            System.out.println("papka yaratildi! ");
        }else {
            System.out.println("avvaldan papka yaratilgan! ");
        }

        File f = new File("./src/fileLesson/new/yangi.txt");
        try {
            if(f.createNewFile()){
                System.out.println(f.getName() + " nomli fayl yaratildi");
            }else {
                System.out.println("avvaldan file yaratilgan! ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("getPath() - " + f.getPath());
        System.out.println("getAbsolutePath() - " + f.getAbsolutePath());
        System.out.println("getAbsoluteFile() - " + f.getAbsoluteFile());

        System.out.println("-------sana------");
        System.out.println("List modified at: " + new Date(f.lastModified()));
        System.out.println("Size: " + f.length());


        if (file.delete()){
            System.out.println("papka o'chirildi! ");
        }else {
            System.out.println("papka mavjud emas");
        }


    }
}
