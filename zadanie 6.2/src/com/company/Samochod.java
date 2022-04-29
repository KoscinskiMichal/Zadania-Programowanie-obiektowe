package com.company;

import java.util.Scanner;

public class Samochod {
    String marka,model,nadwozie,kolor;
    int rokprodukcji;
    double przebieg;


    public Samochod() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj marke ");
        this.marka = in.next();
        System.out.println("Podaj model ");
        this.model = in.next();
        System.out.println("Podaj nadwozie");
        this.nadwozie = in.next();
        System.out.println("Podaj kolor");
        this.kolor = in.next();
        System.out.println("Podaj rok produkcji ");
        this.rokprodukcji = in.nextInt();
        System.out.println("Podaj przebieg");
        double p = in.nextDouble();
        while (p<0){
            System.out.println("podano ujemny przebieg");
            System.out.println("Podaj przebieg");
            p = in.nextDouble();
        }
        this.przebieg=p;
    }

    public Samochod(String marka, String model, String nadwozie, String kolor, int rokprodukcji, double przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rokprodukcji = rokprodukcji;
        this.przebieg = przebieg;
    }

    void opis(){
        System.out.println("marka: "+marka+"\nmodel: "+model+"\nnadwozie: "+nadwozie+"\nkolor: "+kolor+"\nrok produkcji: "+rokprodukcji+"\nprzebieg:"+przebieg+"km");
    }

}
