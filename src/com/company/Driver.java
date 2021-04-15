package com.company;

public class Driver {

    private String name;
    private String cpf;
    private String birthdate;
    private Cnh cnh;
    private Car car;

    public Driver(String name, String cpf, String birthdate, Cnh cnh,Car car) {
        this.name=name;
        this.cpf=cpf;
        this.birthdate=birthdate;
        this.cnh=cnh;
        this.car=car;
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

    public Cnh getCnh() {
        return cnh;
    }

    public void setCnh(Cnh cnh) {
        this.cnh = cnh;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}