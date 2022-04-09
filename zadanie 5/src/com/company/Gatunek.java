package com.company;

public class Gatunek {
    String nazwaGatunku,nazwaRodzaju;
    int liczbaChx;
    int liczbaCh2n;
    String opis;

    public Gatunek(){

    }

    public Gatunek(String nazwaGatunku, String nazwaRodzaju, int liczbaChx, int liczbaCh2n, String opis) {
        this.nazwaGatunku = nazwaGatunku;
        this.nazwaRodzaju = nazwaRodzaju;
        this.liczbaChx = liczbaChx;
        this.liczbaCh2n = liczbaCh2n;
        this.opis = opis;
    }
    public void Nazwa(){
        System.out.println("Rodzaj: "+nazwaRodzaju+" Gatunek: "+nazwaGatunku);
    }
    public void Ch(){
        System.out.println("Liczba chromosomow: "+(liczbaCh2n/2));
    }
    public void getInfo(){
        Nazwa();
        System.out.println("Chromosomy:\n-2n: "+liczbaCh2n+"\n-x: "+liczbaChx+"\n"+opis);
    }
    public Gatunek Clone(){
        Gatunek klon = new Gatunek(this.nazwaGatunku,this.nazwaRodzaju,this.liczbaChx,this.liczbaCh2n,this.opis);
        return klon;
    }
}
