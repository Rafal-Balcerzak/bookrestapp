package com.ksiazki.openapi.model;

public class Ksiazka {

    private String iban;
    private String nazwa;

    public Ksiazka(String iban, String nazwa) {
        this.iban = iban;
        this.nazwa = nazwa;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
