package com.company;

public class Ksiazka {
    String autor,tytul,opis;
    int rok;
    double cena;

    public Ksiazka() {
    }

    public Ksiazka(String autor, String tytul, String opis, double cena, int rok) {
        this.autor = autor;
        this.tytul = tytul;
        this.opis = opis;
        this.cena = cena;
        this.rok = rok;
    }

    void opis(){
        System.out.println(opis);
    }

    void info(){
        System.out.println("Ksiazka "+autor+" "+tytul+" "+rok+" "+opis);
    }

}
