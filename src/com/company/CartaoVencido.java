package com.company;

public class CartaoVencido extends Exception {
    public CartaoVencido(){
        super("Seu cartao esta vencido");
    }
}
