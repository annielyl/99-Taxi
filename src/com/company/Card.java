package com.company;

public class Card {

    private String name;
    private String number;
    private String cvv;
    private int expirationYear;

    public Card(String name, String number, String cvv, int expiationYear) {
        this.name = name;
        this.number = number;
        this.cvv = cvv;
        this.expirationYear = expirationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }
}