package com.company;

public class RotaInvalida extends Exception {
    public RotaInvalida(){
        super("Seu ponto de partida eh o mesmo de chegada");
    }
}
