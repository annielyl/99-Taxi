
package com.company;

public class Driver extends User {

    private Cnh cnh;
    private Car car;

    public Driver(String name, String cpf, String birthdate, Cnh cnh, Car car){
        super(name, cpf, birthdate);
        this.cnh = cnh;
        this.car = car;
    }

    public void ValidarMotorista() throws Exception{
        if (cnh.getCategory()!="B" && cnh.getCategory()!="AB") {
            throw new CnhInvalidaException();
        }
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