package com.itsuhbat.CRM.markets;

import com.itsuhbat.CRM.personnel.Employee;
import com.itsuhbat.CRM.products.Product;
import com.itsuhbat.CRM.service.SellerService;
import com.itsuhbat.CRM.service.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static com.itsuhbat.CRM.helper.Config.scanner;

public class Market {

    private String name;
    private String address;
    private Product[] products;
    private Employee[] employees;
    private Double square;
    private String startTime;
    private String endTime;
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
        products = temp;    // 1-usulda ham yoziladi
    }

    public void printProduct(){
        for (int i=0; i<index; i++){
            System.out.println(i + 1 + " - " + products[i]);
        };
    }
    public void printProduct(int size){
        for (int i=0;i<size && i<index; i++){
            System.out.println(i + 1 + " - " + products[i]);
        };
    }

    public void deleteProduct(){

        String nameProduct;
        Scanner nameScaner = new Scanner(System.in);
        System.out.println("o'chirish uchun maxsulot nomini kiriting:");
        nameProduct = nameScaner.nextLine();
        Product[] anotherArray = new Product[products.length-1];


        for (int i = 0, k = 0; i < index; i++) {

            if (products[i].getName().equalsIgnoreCase(nameProduct)) {
                continue;
            }
            anotherArray[k++] = products[i];
        }
        products = anotherArray;
        index--;

        System.out.println("Mahsulot o'chirildi**********");
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

        System.out.println("Xodim ma`lumotlari o'chirildi**********");
    }




    //market maydonini o`zgartirish methodi
    public void changeMarketInfo(){

        Scanner scanner = new Scanner(System.in);
        int action;

        do {
            System.out.println(
                    "Market maydonini tanlang: " +
                            "\n[1].nomini o'zgartirish " +
                            "\n[2].manzilini o'zgartirish " +
                            "\n[3].maydonini o'zgartirish " +
                            "\n[4].ish boshlash vaqtini o'zgartirish " +
                            "\n[5].ish tugash vaqtini o'zgartirish " +
                            "\n[0].Ortga qaytish");
            action = scanner.nextInt();
            switch (action){
                case 1: changeMarketName();break;
                case 2: changeMarketAddress();break;
                case 3: changeMarketSquare();break;
                case 4: changeMarketStartTime();break;
                case 5: changeMarketEndTime();break;
                case 0: {
                    SellerService seller = new SellerService();
                    seller.start();
                }
            }
        }while (true);
    }


    public void changeMarketName(){
//        Scanner scanner = new Scanner(System.in);
        System.out.print("Yangi nomni kiriting: ");
        scanner.nextLine();
        String marketName = scanner.nextLine();
        setName(marketName);
        System.out.println("---------------------------------------------");
        marketInfo();
        System.out.println("---------------------------------------------");
    }
    public void changeMarketSquare(){
        System.out.print("Yangi maydonni kiriting: ");
//        scanner.nextDouble();
        Double marketSquare = scanner.nextDouble();
        setSquare(marketSquare);
        System.out.println("---------------------------------------------");
        marketInfo();
        System.out.println("---------------------------------------------");
    }
    public void changeMarketAddress(){
        System.out.print("Yangi manzilni kiriting: ");
//        scanner.nextLine();
        String marketAddress = scanner.nextLine();
        setAddress(marketAddress);

        System.out.println("---------------------------------------------");
        marketInfo();
        System.out.println("---------------------------------------------");
    }
    public void changeMarketStartTime(){
        System.out.print("Ish boshlash vaqtini kiriting: ");
//        scanner.nextLine();
        String marketStartTime = scanner.nextLine();
        setStartTime(marketStartTime);
        System.out.println("---------------------------------------------");
        marketInfo();
        System.out.println("---------------------------------------------");
    }
    public void changeMarketEndTime(){
        System.out.print("Ish tugash vaqtini kiriting: ");
        scanner.nextLine();
        String marketEndTime = scanner.nextLine();
        setEndTime(marketEndTime);
        System.out.println("---------------------------------------------");
        marketInfo();
        System.out.println("---------------------------------------------");
    }

    //  Sotuvchi------------------------------------------------
    public void printClient(){
        Scanner scanner = new Scanner(System.in);
        int action;

//        do {
//            System.out.println(
//                    "Menyuni tanlang: " +
//                            "\n[1].Mahsulotlar ro'yxati " +
//                            "\n[2].Mahsulotlar ketma-ketlikda chiqarish " +
//                            "\n[3].Mahsulot sotib olish " +
//                            "\n[0].Dasturni tugatish");
//            action = scanner.nextInt();
//            switch (action){
//                case 1: printProduct(); break;
//                case 2: {
//                    System.out.println("o'lchamini kiriting: ");
//                    int size = scanner.nextInt();
//                    printProduct(size); break;
//                }
//                case 3: {
//                    System.out.println("Mahsulot nomerini kiriting: ");
//                    int id = scanner.nextInt();
//                    productId(id); break;
//                }
//                case 0: System.exit(0);
//            }
//        }while (true);
    }

    public void productId(int id){
        for (int i=0;i< products.length; i++){
            if (i == id) {

                System.out.printf("Omborda %.1f kg %s qolgan \n", products[i-1].getAmount(), products[i-1].getName());
                Scanner scanner = new Scanner(System.in);
                System.out.printf("Qancha miqdorda %s sotib olmoqchisiz? \n", products[i-1].getName());
                double amountProduct = scanner.nextDouble();
                if (products[i-1].getAmount() < amountProduct){
                    System.out.printf(
                            "Omborda %.1f kg %s qolgan, kamroq miqdor kiriting! \n",
                            products[i-1].getAmount(), products[i-1].getName()
                            );
                    productId(id);
                }else {
                    System.out.printf("Siz %.1f so'mlik %s sotib oldingiz! \n", amountProduct*products[i-1].getPrice(), products[i-1].getName());
                    System.out.printf("Omborda %.1f kg %s qoldi! \n", products[i-1].getAmount()-amountProduct, products[i-1].getName());

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

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
        index = products.length;
        resizeArray();
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

    // %s -> string
    // %d -> butun sonlar (int, short, byte, long)
    // %f -> haqiqiy sonlar (float,double)
}
