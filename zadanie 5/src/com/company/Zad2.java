package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Zad2 {
    String nazwa;
    int l_pieter;
    LocalDate rokBudowy;

    public Zad2(String nazwa, int l_pieter, LocalDate rokBudowy) {
        this.nazwa = nazwa;
        this.l_pieter = l_pieter;
        this.rokBudowy = rokBudowy;
    }
    public long getDataBudowy(){
        LocalDate today = LocalDate.now();
        long ilelat = ChronoUnit.YEARS.between(rokBudowy,today);
        return ilelat;
    }

    public void getInfo(){
        System.out.println("Budynek "+nazwa+"posada "+l_pieter+" pieter"
        +" wiek budynku "+ getDataBudowy());
    }

}
