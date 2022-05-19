package com.company;

public class Adres {
    String ulica,miasto,kodPocztowy;
    int numerDomu;

    public Adres(String ulica, String miasto, String kodPocztowy, int numerDomu) throws NieprawidlowyAdresException {
        if (ulica == null) {
            throw new NieprawidlowyAdresException("Ulica nie moze byc nullem");
        } else this.ulica = ulica;

        if (miasto == null) {
            throw new NieprawidlowyAdresException("Miasto nie moze byc nullem");
        } else this.miasto = miasto;

        if (kodPocztowy == null) {
            throw new NieprawidlowyAdresException("kod pocztowy nie moze byc nullem");
        } else this.kodPocztowy = kodPocztowy;

        if (numerDomu <= 0) {
            throw new NieprawidlowyAdresException("numer domu musi byc wiekszy od 0");
        } else this.numerDomu = numerDomu;
    }

}
