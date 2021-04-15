package com.company;

public class Passenger extends User  {

    private Adress adress;
    private Card card;

    public Passenger(String name, String cpf, String birthdate,Adress adress, Card card) {
        super(name,cpf,birthdate);
        this.adress=adress;
        this.card=card;

    }

    @Override
    public void registerUser() {
        System.out.println("Usuario do tipo: passageiro "+getAdress().getCity() );

    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
