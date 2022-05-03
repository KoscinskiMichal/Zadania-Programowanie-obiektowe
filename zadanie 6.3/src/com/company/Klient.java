package com.company;

public class Klient {
    String imie;
    double pieniadze;

    public Klient() {
    }

    public Klient(String imie, double pieniadze) {
        this.imie = imie;
        this.pieniadze = pieniadze;
    }

    public String getImie() {
        return imie;
    }

    public double getPieniadze() {
        return pieniadze;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setPieniadze(double pieniadze) {
        this.pieniadze = pieniadze;
    }

    public void kup(Ksiazka ksiazka){
        if (ksiazka.cena<this.pieniadze){
            System.out.println(this.imie+" kupił "+ksiazka.tytul+" za "+ksiazka.cena+ " zl");
            this.pieniadze-=ksiazka.cena;
        }else System.out.println(this.imie+" nie stac na "+ ksiazka.tytul);
    }


}
