package CollectionLesson;

import java.util.HashSet;

public class EmployeList {
    public static void main(String[] args) {
        HashSet<EmployeHomework> list = new HashSet<>();
        EmployeHomework employe1 = new EmployeHomework(1, "Sardor", "bosh mutaxasis", 4500);
        EmployeHomework employe2 = new EmployeHomework(2, "Sarvar", "yetakchi mutaxasis", 4300);
        EmployeHomework employe3 = new EmployeHomework(3, "Anvar", "akt mutaxasis", 4200);
        EmployeHomework employe4 = new EmployeHomework(4, "Olim", "boshqa mutaxasis", 4500);
        list.add(employe1);
        list.add(employe2);
        list.add(employe3);
        list.add(employe4);

        list.forEach(item -> {
            System.out.println(item.getId());
            System.out.println(item.getName());
            System.out.println(item.getOylik());
            System.out.println(item.getPosition());
        });
    }
}
