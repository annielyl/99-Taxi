package com.company;

public class Time {

    private Route route;
    static double fixTime = 0.001;

    public Time(Route route) {

        this.route = route;

    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public double getValRun() {
        int dist = (int) this.route.getDistance();
        double timeRun = dist * fixTime;
        return timeRun;
    }
}