package com.company;

public class CnhInvalidaException extends Exception {
    public CnhInvalidaException() {
        super ("A categoria da sua CNH nao é valida");

    }
}
