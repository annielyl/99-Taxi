package com.company;

public class Route {
    private StartPoint startPoint;
    private EndPoint endPoint;

    public Route(StartPoint startPoint, EndPoint endPoint){

        this.startPoint=startPoint;
        this.endPoint=endPoint;
    }
    public void ValidarRota()throws Exception{
        if(getDistance()<=0){
            throw new RotaInvalida();
        }
    }

    public int getDistance() {
        int distx = this.endPoint.getCoordinateX() - this.startPoint.getCoordinateX();
        distx=Math.abs(distx);
        int disty=this.endPoint.getCoordinateY()-this.startPoint.getCoordinateY();
        disty=Math.abs(disty);
        int distance=distx+disty;
        return distance;
    }

}


