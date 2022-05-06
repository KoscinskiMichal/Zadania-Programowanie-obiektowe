package com.company;

public class Samolot implements Lata {
    String nazwa;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void lec(){
        System.out.println(this.nazwa+ " leci");
    }

}
