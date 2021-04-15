package com.company;

public class Pay {
    private Card card;
    private Route route;
    private double valueRun=0.0;
    static double fixdVal=0.0001;
    private Driver driver;

    public Pay(Card card, Route route, Driver driver) {

        this.card = card;
        this.route = route;
        this.driver=driver;
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

    public double getValueRun() {
        double dist=this.route.getDistance();
        double valueRun=dist*fixdVal;
        return valueRun;
    }

}
