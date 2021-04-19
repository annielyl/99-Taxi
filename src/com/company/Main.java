package com.company;

public class Main {

    public static void main(String[] args) {


        Car car1= new Car("asd554","gol","branco");
        Cnh cnh1= new Cnh("1232","B","12/12/2021");
        Driver driver1= new Driver("JP","2321","21/12/1990",cnh1,car1);

       try{driver1.ValidarMotorista();
       }
       catch (Exception exception){
            System.out.println(exception.getMessage());
       }

        Adress adress1= new Adress("carlos azevedo","centro","rio grande","RS","31");
        Card card1=new Card("Anniely lemos","2343 23434","123",2022);
        Passenger passenger1 = new Passenger("Anni", "24324", "21/01/2000", adress1, card1);

        try{
            card1.ValidarCartao();
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }

        StartPoint startPoint1= new StartPoint(123123,123123);
        EndPoint endPoint1= new EndPoint(123123,123123);
        Route route1= new Route( startPoint1,endPoint1);

        try{
            route1.ValidarRota();
            Race race1= new Race(route1,driver1,passenger1);
            Payment payment1= new Payment(card1,route1,driver1);
            Time time1= new Time(route1);

            Resume resume1= new Resume(payment1,time1, race1,new Confort());
            resume1.getAbstract(payment1,time1,race1,new Confort());
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }




    }
}
