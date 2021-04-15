package com.company;

public class User {

    private String name;
    private String cpf;
    private String birthdate;
    private Adress adress;
    private Card card;

    public User(String name, String cpf, String birthdate,Adress adress,Card card) {

        this.name=name;
        this.cpf=cpf;
        this.birthdate=birthdate;
        this.adress=adress;
        this.card=card;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
