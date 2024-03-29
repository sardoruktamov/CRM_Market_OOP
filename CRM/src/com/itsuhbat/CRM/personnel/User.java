package com.itsuhbat.CRM.personnel;

import com.itsuhbat.CRM.markets.Market;

public class User {

    private String firstName;
    private String lastName;
    private Double account;


    public User(String firstName, String lastName, Double account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;
    }

    public User(){}




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
        return String.format("[1].Ism: %s\n[2].Familya: %s \n[3].Hisobdagi pul miqdori: %.2f", firstName, lastName, account);
    }
}
