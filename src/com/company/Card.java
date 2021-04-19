package com.company;

public class Card {

    private String name;
    private String number;
    private String cvv;
    private long expirationYear;

    public Card(String name, String number, String cvv, long expirationYear) {
        this.name = name;
        this.number = number;
        this.cvv = cvv;
        this.expirationYear = expirationYear;
    }
    public void ValidarCartao()throws Exception{
        if(getExpirationYear()<2021){
            throw new CartaoVencido();
        }
    }

    public long getExpirationYear() {
        return expirationYear;
    }

    public long setExpirationYear(long expirationYear) {
        this.expirationYear = expirationYear;
        return expirationYear;
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

}