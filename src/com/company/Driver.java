
package com.company;

public class Driver extends User {

    private Cnh cnh;
    private Car car;

    public Driver(String name, String cpf, String birthdate, Cnh cnh, Car car) throws Exception {
        super(name, cpf, birthdate);
        if (cnh.getCategory()!="B" && cnh.getCategory()!="AB") {
            throw new CnhInvalidaException();
        }
        this.cnh = cnh;
        this.car = car;
    }

    public void registerUser() {

        System.out.println("Usuario do tipo: motorista " + getCnh().getId());
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