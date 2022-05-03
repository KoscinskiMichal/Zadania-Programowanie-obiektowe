package com.company;

public class Podrecznik extends Ksiazka {
    String tematyka;
    int rozdzialy,strony;

    public Podrecznik(String autor, String tytul, String opis, double cena, int rok, String tematyka, int rozdzialy, int strony) {
        super(autor, tytul, opis, cena, rok);
        this.tematyka = tematyka;
        this.rozdzialy = rozdzialy;
        this.strony = strony;
    }

    void info() {
        System.out.println("Podrecznik "+autor+" "+tytul+" r."+rok+" "+opis+" "+tematyka+" l.stron "+strony);

    }
}
