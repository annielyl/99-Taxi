package com.company;

public class Payment {
    private Card card;
    private Route route;
    private double valueRun=0.0;
    private Driver driver;

    public Payment(Card card, Route route, Driver driver) {

        this.card = card;
        this.route = route;
        this.driver=driver;
    }

    public double calcularCorrida(Route route, TypeRace typeRace)  {
            double dist=this.route.getDistance();
            double valueRun=dist*typeRace.getPrecoRelativo();

            return valueRun;
    }


    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

}
