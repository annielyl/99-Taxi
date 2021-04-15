package com.company;

public class Main {

    public static void main(String[] args) {


        Car car1= new Car("asd554","gol","branco");
        Cnh cnh1= new Cnh("1232","AB","12/12/2021");
        Driver driver1= new Driver("JP","2321","21/12/1990",cnh1,car1);

        Adress adress1= new Adress("carlos azevedo","centro","rio grande","RS","31");
        Card card1=new Card("Anniely lemos","2343 23434","123","12/21");
        User user1 = new User("Anni","24324","21/01/2000",adress1,card1);

        StartPoint startPoint1= new StartPoint(123123,123122);
        EndPoint endPoint1= new EndPoint(111111,11111);
        Route route1= new Route(startPoint1,endPoint1);
        Pay pay1= new Pay(card1,route1);
        Time time1= new Time(route1);


        Car car2= new Car("asd234","celta","branco");
        Cnh cnh2= new Cnh("1111","B","12/12/2024");
        Driver driver2= new Driver("Rafa","34543","21/12/1990",cnh2,car2);

        Adress adress2= new Adress("buarque de macedo","centro","rio grande","RS","1");
        Card card2=new Card("Artur","2343 2345","111","12/21");
        User user2= new User("Artur","923473","01/11/1998",adress2,card2);

        StartPoint startPoint2= new StartPoint(223123,223122);
        EndPoint endPoint2= new EndPoint(111111,11111);
        Route route2= new Route(startPoint2,endPoint2);
        Pay pay2= new Pay(card2,route2);
        Time time2= new Time(route2);

        System.out.println(user1.getName()+" Bem vindo a 99 taxi\n o motorista da sua corrida eh "+driver1.getName()+". Seu carro chegará em breve, fique atento ao modelo: "+car1.getModel()+", cor: "+car1.getColor()+" e a placa: "+ car1.getPlate());
        System.out.println("A cnh do motorista "+driver1.getName()+" esta valida ate "+cnh1.getValidity());
        System.out.println(" ");
        System.out.println("Calculando rota...\n O tempo estimado dessa corida é de: "+time1.getValRun()+" minutos\n Baseado na sua rota, sua corria custara R$: "+pay1.getValRun()+ ". e sera cobrado no cartao de numero: "+card1.getNumber());

        System.out.println(" ");

        System.out.println(user2.getName()+" Bem vindo a 99 taxi\n  o motorista da sua corrida eh "+driver2.getName()+". Seu carro chegará em breve, fique atento ao modelo: "+car2.getModel()+", cor: "+car2.getColor()+" e a placa: "+ car2.getPlate());
        System.out.println("A cnh do motorista "+driver2.getName()+" esta valida ate "+cnh2.getValidity());
        System.out.println(" ");
        System.out.println("Calculando a 99 taxi rota...\n O tempo estimado dessa corida é de: "+time2.getValRun()+" minutos\n Baseado na sua rota, sua corria custara R$: "+pay2.getValRun()+ ". e sera cobrado no cartao de numero: "+card2.getNumber());


    }
}
