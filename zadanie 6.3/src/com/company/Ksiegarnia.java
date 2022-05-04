package com.company;

import java.time.LocalDate;

public class Ksiegarnia {
    Ksiazka[] polka = new Ksiazka[]{};
    String nazwa;
    LocalDate data = LocalDate.now();

    public Ksiegarnia() {
    }

    public Ksiegarnia(Ksiazka[] polka, String nazwa) {
        this.polka = polka;
        this.nazwa = nazwa;
    }

    void paragon(Ksiazka[] towar){
        System.out.println("\t\tKsiegarnia "+nazwa+"\n");
        double suma =0;
        for (int i = 0; i < towar.length; i++) {
            System.out.println((i+1)+"."+towar[i].tytul+""+towar[i].autor+"\n");
            suma += towar[i].cena;
        }
        System.out.println(this.data+"\t\t\tcena: "+suma);

    }
}
