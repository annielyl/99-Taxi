package com.company;

public class Card {

    private String name;
    private String number;
    private String cvv;
    private String validity;

    public Card(String name, String number, String cvv, String validity) {
        this.name = name;
        this.number = number;
        this.cvv = cvv;
        this.validity = validity;
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

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }
}
