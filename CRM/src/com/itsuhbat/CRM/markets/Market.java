package com.itsuhbat.CRM.markets;

import com.itsuhbat.CRM.personnel.Employee;
import com.itsuhbat.CRM.personnel.User;
import com.itsuhbat.CRM.products.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Market {

    private String name;
    private String address;
    private ArrayList<Product> products;
    private Employee[] employees;
    private Double square;
    private String startTime;
    private String endTime;
    // index of new insted product
    private int index;

    public Market() {
        products = new ArrayList<>();
        employees = new Employee[10];
    }

    User user = new User();

    public Market(String name, String address, Double square, int prodectCount, int employeeCount) {
        this.name = name;
        this.address = address;
        this.square = square;
        products = new ArrayList<>(prodectCount);
        employees = new Employee[employeeCount];
    }

    public Market(String name, String address, Double square, String startTime, String endTime, int prodectCount, int employeeCount) {
        this.name = name;
        this.address = address;
        this.square = square;
        this.startTime = startTime;
        this.endTime = endTime;
        employees = new Employee[employeeCount];
    }

    public void marketInfo(){
        System.out.printf("Market nomi: %s Manzili: %s Maydoni: %.1f ish boshlash vaqti: %s ish tugash vaqti: %s \n",
                getName(), getAddress(), getSquare(), getStartTime(), getEndTime());
    }
    public void addProduct(){
        String name, type, unit;
        double price, amount;
        Scanner scanner = new Scanner(System.in);
        System.out.print("name: ");
        name = scanner.nextLine();
        System.out.print("type: ");
        type = scanner.nextLine();
        System.out.print("o'lchov birligi: ");
        unit = scanner.nextLine();
        System.out.print("miqdori: ");
        amount = scanner.nextDouble();
        System.out.print("narxi: ");
        price = scanner.nextDouble();

        Product product = new Product(name,price, type,amount,unit);


        products.add(product);
        System.out.println(name+" ma`lumotlari muvoffaqiyatli qo`shildi"+"\n"+"*****************************************");
    }

    //product massivini uzunligini oshirish
//    public void resizeArray(){
//        Product[] temp = new Product[products.length + 1];
//
//        //1-usul
////        products = Arrays.copyOf(products, products.length + 1);
//
//        // 2-usul
//
//        for (int i=0; i<products.length; i++){
//            temp[i] = products[i];      //product qiymatlarini vaqtincha temp ga olib o`tyapmiz
//        }
//        products = temp;    // 1-usulda ham yoziladi
//    }

    public Product delProduct(int number){
        if (number >= products.size()){
            System.out.println("Bunday o'rindagi mahsulotlar mavjud emas!");
            return null;
        }
//        Product sales = products[number-1];
//        for (int i=number-1; i<index-1;i++){
//            products[i] = products[i+1];
//        }
//        products[index-1] = null;
//        index--;

        return products.remove(number);
    }

    public void printProduct(){
        int i=1;
        System.out.println("***********");
//        products.forEach(s -> {
//            System.out.println(s);
//        });
        for (Product product: products){
            System.out.println(i + " - " + product);
            i++;
        };
    }

    public void printProduct(int size){
        for (int i=0;i<size && i<products.size(); i++){
            System.out.println(i + 1 + " - " + products.get(i));
        };
    }

    public void deleteProduct(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("o'chirish uchun maxsulot nomerini kiriting:");
        int number = scanner.nextInt()-1;
        products.remove(number);
        System.err.println("Mahsulot o'chirildi**********");
    }

    public void deleteEmployee(){

        String nameEmployee;
        Scanner nameScaner = new Scanner(System.in);
        System.out.println("o'chirish uchun maxsulot nomini kiriting:");
        nameEmployee = nameScaner.nextLine();
        Employee[] anotherArray = new Employee[employees.length-1];


        for (int i = 0, k = 0; i < index; i++) {

            if (employees[i].name.equalsIgnoreCase(nameEmployee)) {
                continue;
            }
            anotherArray[k++] = employees[i];
        }
        employees = anotherArray;
        index--;

        System.err.println("Xodim ma`lumotlari o'chirildi**********");
    }


    public void productId(int id){
        for (int i=0;i< products.size(); i++){
            if (i == id) {

                System.out.printf("Omborda %.1f kg %s qolgan \n", products.get(i-1).getAmount(), products.get(i-1).getName());
                Scanner scanner = new Scanner(System.in);
                System.out.printf("Qancha miqdorda %s sotib olmoqchisiz? \n", products.get(i-1).getName());
                double amountProduct = scanner.nextDouble();
                if (products.get(i-1).getAmount() < amountProduct){
                    System.out.printf(
                            "Omborda %.1f kg %s qolgan, kamroq miqdor kiriting! \n",
                            products.get(i-1).getAmount(), products.get(i-1).getName()
                            );
                    productId(id);
                }else {
                    System.out.println("FIO:  " + user);
                    System.out.println("pul miqdoriiiii:  " + user.getAccount());
                    System.out.printf("Siz %.1f so'mlik %s sotib oldingiz! \n", amountProduct*products.get(i-1).getPrice(), products.get(i-1).getName());
                    System.out.printf("Omborda %.1f kg %s qoldi! \n", products.get(i-1).getAmount()-amountProduct, products.get(i-1).getName());
                    System.err.println("**************************************");

                }
            }
        };

    }
    //  Eployeee------------------------------------------------
    public void addEmployee(){
        String name;
        Integer experience;
        Double salary;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Employee name: ");
        name = scanner.nextLine();
        System.out.print("Employee experience(year): ");
        experience = scanner.nextInt();
        System.out.print("Employee salary: ");
        salary = scanner.nextDouble();

        Employee employee = new Employee(name,experience, salary);

        if (index == employees.length){
            resizeArrayEmployee();
        }
        employees[index++] = employee;

        System.out.println(name+" ma`lumotlari muvoffaqiyatli qo`shildi"+"\n"+"*****************************************");
    }
    public void resizeArrayEmployee() {
        //1-usul
        Arrays.copyOf(employees, employees.length + 1);
    }
    public void printEmploees(){
        for (int i=0; i<index; i++){
            System.out.println(i+1+"-"+employees[i]);
        }
    }

    public void selectEmployee(){
        Scanner scanner = new Scanner(System.in);
        int action;

        do {
            System.out.println(
                    "Menyuni tanlang: " +
                            "\n[1].Employee qo'shish " +
                            "\n[2].Employee ro'yxati " +
                            "\n[3].Employee o'chirish " +
                            "\n[0].Dasturni tugatish");
            action = scanner.nextInt();
            switch (action){
                case 1: addEmployee(); break;
                case 2: printEmploees(); break;
                case 3: deleteEmployee(); break;
                case 0: System.exit(0);
            }
        }while (true);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 5)
            this.name = name;
        else System.out.printf("%s uzunligi yetarli emas!", name);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (name.length() > 5)
            this.address = address;
        else System.out.printf("%s uzunligi yetarli emas!", address);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        if (square > 25)
            this.square = square;
        else System.out.println("25 mKv dan yuqori bo'lishi kerak!");
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return String.format("Nomi: %s \nManzili: %s \nHajmi: %.1f \nIsh boshlash vaqti: %s \nIsh tugash vaqti: %s ",
                name, address, square, startTime, endTime);
    }


    public String toStringWithNumber() {
        return String.format("[1].Nomi: %s \n[2].Manzili: %s \n[3].Hajmi: %.1f \n[4].Ish boshlash vaqti: %s \n[5].Ish tugash vaqti: %s ",
                name, address, square, startTime, endTime);
    }

    // %s -> string
    // %d -> butun sonlar (int, short, byte, long)
    // %f -> haqiqiy sonlar (float,double)
}
