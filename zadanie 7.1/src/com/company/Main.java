package com.company;

public class Main {

    public static void main(String[] args) {
        Statek prom = new Statek();
        Samolot boeing = new Samolot();
        Samochod bmw = new Samochod();

        //prom.setNazwa("ss.wolnosc");
        boeing.setNazwa("777");
        bmw.setNazwa("e36");

        prom.plyn();
        boeing.lec();
        bmw.jedz();



    }
}
