package com.company;

public class Abstract {

    private Pay pay;
    private Time time;
    private Run run;

    public Abstract(Pay pay,Time time, Run run) {

        this.pay=pay;
        this.time=time;
        this.run=run;
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

    public Run getRun() {
        return run;
    }

    public void setRun(Run run) {
        this.run = run;
    }

    public void getAbstract(Pay pay,Time time, Run run){

        System.out.println(getRun().getPassenger().getName()+" Este é o resumo da sua corrida");
        System.out.println("Seu motorista foi: "+getRun().getDriver().getName());
        System.out.println("Sua corida custou R$: "+getPay().getValueRun());
        System.out.println("O tempo da sua corrida em minutos foi de: "+getTime().getTimeRun());
    }
}
