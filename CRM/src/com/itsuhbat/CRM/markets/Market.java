package com.itsuhbat.CRM.markets;

import com.itsuhbat.CRM.personnel.Employee;
import com.itsuhbat.CRM.products.Product;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Market {

    public String name;
    public String address;
    public Product[] products;
    public Employee[] employees;
    public Double square;
    public String startTime;
    public String endTime;
    // index of new insted product
    private int index;

    public Market() {
        products = new Product[10];
        employees = new Employee[10];
    }


    public Market(String name, String address, Double square, int prodectCount, int employeeCount) {
        this.name = name;
        this.address = address;
        this.square = square;
        products = new Product[prodectCount];
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

    public void addProduct(){
        String name, type, unit;
        double price, amount;
        Scanner scanner = new Scanner(System.in);
        System.out.print("name: ");
        name = scanner.nextLine();
        System.out.print("type: ");
        type = scanner.nextLine();
        System.out.print("unit: ");
        unit = scanner.nextLine();
        System.out.print("amount: ");
        amount = scanner.nextDouble();
        System.out.print("price: ");
        price = scanner.nextDouble();

        Product product = new Product(name,price, type,amount,unit);

        if (index == products.length){
            resizeArray();
        }
        products[index++] = product;
        System.out.println(name+" ma`lumotlari muvoffaqiyatli qo`shildi"+"\n"+"*****************************************");
    }

    //product massivini uzunligini oshirish
    public void resizeArray(){
        Product[] temp = new Product[products.length + 1];

        //1-usul
//        products = Arrays.copyOf(products, products.length + 1);

        // 2-usul

        for (int i=0; i<products.length; i++){
            temp[i] = products[i];      //product qiymatlarini vaqtincha temp ga olib o`tyapmiz
        }
        products = temp;
    }

    public void printProduct(){
        for (int i=0; i<index; i++){
            System.out.println(i + 1 + " - " + products[i]);
        };
    }

    public void deleteProduct(){
        System.out.println("o'chirildi**********");
    }

    public void selectProduct(){

        Scanner scanner = new Scanner(System.in);
        int action;

        do {
            System.out.println(
                    "Menyuni tanlang: " +
                            "\n[1].Mahsulot qo'shish " +
                            "\n[2].Mahsulotlar ro'yxati " +
                            "\n[3].Mahsulotni o'chirish " +
                            "\n[0].Dasturni tugatish");
            action = scanner.nextInt();
            switch (action){
                case 1: addProduct(); break;
                case 2: printProduct(); break;
                case 3: deleteProduct(); break;
                case 0: System.exit(0);
            }
        }while (true);
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
                case 4: addEmployee(); break;
                case 5: printEmploees(); break;
                case 6: deleteProduct(); break;
                case 0: System.exit(0);
            }
        }while (true);
    }

    @Override
    public String toString() {
        return String.format("Nomi: %s \nManzili: %s \nHajmi: %.1f \nIsh boshlash vaqti: %s \nIsh tugash vaqti: %s ",
                name, address, square, startTime, endTime);
    }

    // %s -> string
    // %d -> butun sonlar (int, short, byte, long)
    // %f -> haqiqiy sonlar (float,double)
}
