package com.company;

public class Race {
    private Route route;
    private Driver driver;
    private Passenger passenger;

    public Race(Route route,Driver driver, Passenger passenger)  {
        this.route = route;
        this.driver = driver;
        this.passenger = passenger;

    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

}

