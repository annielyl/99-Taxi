package com.company;

public class Resume {

    private Pay pay;
    private Time time;
    private Race race;

    public Resume(Pay pay,Time time, Race race) {

        this.pay=pay;
        this.time=time;
        this.race=race;
    }

    public Pay getPay() {
        return pay;
    }

    public void setPay(Pay pay) {
        this.pay = pay;
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

    public void getAbstract(Pay pay,Time time, Race race){

        System.out.println(getRace().getPassenger().getName()+" Este é o resumo da sua corrida");
        System.out.println("Seu motorista foi: "+getRace().getDriver().getName());
        System.out.println("Sua corida custou R$: "+getPay().getValueRun());
        System.out.println("O tempo da sua corrida em minutos foi de: "+getTime().getTimeRun());
    }
}
