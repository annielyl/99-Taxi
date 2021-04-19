package com.company;

public class Resume {

    private Payment payment;
    private Time time;
    private Race race;
    private TypeRace typeRace;

    public Resume(Payment payment,Time time, Race race,TypeRace typeRace) {

        this.payment=payment;
        this.time=time;
        this.race=race;
        this.typeRace=typeRace;
    }

    public Resume(Payment payment1, Time time1, Race race1) {
    }

    public void getAbstract(Payment payment,Time time, Race race,TypeRace typeRace
    ){

        System.out.println(getRace().getPassenger().getName()+" Este é o resumo da sua corrida");
        System.out.println("Seu motorista foi: "+getRace().getDriver().getName());
        System.out.println("Sua corida custou R$: "+ getPayment().calcularCorrida(getPayment().getRoute(),typeRace));
        System.out.println("O tempo da sua corrida em minutos foi de: "+getTime().getTimeRun());
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPay(Payment payment) {
        this.payment = payment;
    }

    public com.company.Time getTime() {
        return time;
    }

    public void setTime(com.company.Time time) {
        this.time = time;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race run) {
        this.race = race;
    }


    public void getAbstract(Payment payment1, Time time1, Race race1) {
    }
}
