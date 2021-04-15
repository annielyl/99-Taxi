package com.company;

public class Pay {
    private Card card;
    private Route route;
    private double valRun=0.0;
    static double fixdVal=0.0001;

    public Pay(Card card, Route route) {

        this.card = card;
        this.route = route;
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

    public double getValRun() {
        double dist=this.route.getDistance();
        double valRun=dist*fixdVal;
        return valRun;
    }

}
