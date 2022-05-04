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

    public int getRozdzialy() {
        return rozdzialy;
    }

    public void setRozdzialy(int rozdzialy) {
        this.rozdzialy = rozdzialy;
    }

    public int getStrony() {
        return strony;
    }

    public void setStrony(int strony) {
        this.strony = strony;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    void info(){
        System.out.println("Powiesc "+autor+" "+tytul+" r."+rok+" "+opis+" "+rodzaj+" l.stron "+strony+" "+cena+"zl");
    }
}
