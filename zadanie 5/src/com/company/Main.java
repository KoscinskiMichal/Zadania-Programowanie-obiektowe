package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Prostokat p = new Prostokat(2,3);

        p.pole();
        p.obwod();
        p.przekatna();

        Zad2 budynek = new Zad2("UR A0",4,LocalDate.parse("2012-04-12"));
        Zad2 pkin = new Zad2("Palac Kultury i Nauki",42,LocalDate.parse("1955-07-22"));
        Zad2 skytwr = new Zad2("Sky Tower",51,LocalDate.parse("2007-12-12"));

        budynek.getInfo();
        pkin.getInfo();
        skytwr.getInfo();

        Gatunek czlowiek = new Gatunek("Homo Sapiens Sapiens","Homo Sapiens",1,23,"czlowiek rozumny");
        Gatunek kot = new Gatunek("kot domowy","kot",1,18,"pospolity kot");
        Gatunek pies = new Gatunek("pies domowy","wilk",1,39,"pies domowy");
        Gatunek czlowiek1 = czlowiek.Clone();
        czlowiek1.Nazwa();
        czlowiek.getInfo();
        pies.Ch();
        kot.getInfo();
        Gatunek Bernardyn = pies.Clone();
        Bernardyn.getInfo();
    }


}
