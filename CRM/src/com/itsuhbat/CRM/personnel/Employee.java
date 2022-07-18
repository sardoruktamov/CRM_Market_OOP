package com.itsuhbat.CRM.personnel;

public class Employee {
    String name;
    Integer experience;
    Double salary;

    public Employee() {
    }

    public Employee(String name, Integer experience, Double salary) {
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format(
                "Xodim ismi: %s Tajribasi(yil): %d Oylik to'lovi: %f ",
                name, experience,salary);
    }
}
