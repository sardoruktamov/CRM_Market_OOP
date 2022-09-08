package fileLesson;

import Stream.sender_receiver.Data;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class FileStudents {
    private static Scanner scanner;
    private static BufferedReader br;
    static {
        System.out.println("statik blok");
        File f= new File("./src/fileLesson/new/yangi.txt");
        try {
            scanner = new Scanner(new FileInputStream(f));
            br = new BufferedReader(new FileReader(f));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws ParseException, IOException {
        System.out.println("Main methods");
        List<Student> listStudent = readStudentWithFileInputStream();

        for (Student s: listStudent) {
            System.out.println("student=> " + s);
        }
        System.out.println("========BUFFERED READER=====");
        List<Student> studentListWithBufferedReader=readStudentWithBufferedReader();
        studentListWithBufferedReader.forEach(System.out::println);

        System.out.println("========Stream=====");
        List<Student> studentListWithStream=readStudentWithStream();
        studentListWithStream.forEach(System.out::println);
    }

    private static List<Student> readStudentWithBufferedReader() throws IOException, ParseException {
        String s;
        List<Student> students = new ArrayList<>();
        while ((s= br.readLine()) != null){
            Student student = strintToStudent(s);
            students.add(student);
        }
        return students;
    }

    private static List<Student> readStudentWithStream() throws IOException {
        List<Student> students = Files.readAllLines(Paths.get("./src/fileLesson/new/yangi.txt"))
                .stream()
                .map(s -> strintToStudent(s))
                .collect(Collectors.toList());
        return students;
    }

    public static List<Student> readStudentWithFileInputStream() throws ParseException {
        List<Student> students = new ArrayList<>();
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            Student student = strintToStudent(s);
            students.add(student);
        }
        return students;
    }

    private static Student strintToStudent(String s) {
        String[] fields = s.split(" ");
        String firstName = fields[0];
        String lastName = fields[1];
        Integer age = Integer.parseInt(fields[2]);

        Date birthDay = null;
        try {
            birthDay = new SimpleDateFormat("dd.MM.yyyy").parse(fields[3]);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return new Student(firstName,lastName,age,birthDay);
    }


}



