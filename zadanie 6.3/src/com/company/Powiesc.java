package com.company;

public class Powiesc extends Ksiazka{
    int rozdzialy,strony;
    String rodzaj;

    public Powiesc(String autor, String tytul, String opis, double cena, int rok, int rozdzialy, int strony,String rodzaj) {
        super(autor, tytul, opis, cena, rok);
        this.rozdzialy = rozdzialy;
        this.strony = strony;
        this.rodzaj = rodzaj;
    }

    void info(){
        System.out.println("Powiesc "+autor+" "+tytul+" r."+rok+" "+opis+" "+rodzaj+" l.stron "+strony);
    }
}
