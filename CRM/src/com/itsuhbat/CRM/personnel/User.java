package com.itsuhbat.CRM.personnel;

public class User {

    String firstName;
    String lastName;
    Double account;

    public User(String firstName, String lastName, Double account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getAccount() {
        return account;
    }

    public void setAccount(Double account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return String.format("Ism: %s\n Familya: %s \nXisobRaqam: %f", firstName, lastName, account);
    }
}
