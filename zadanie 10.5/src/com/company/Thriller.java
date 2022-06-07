package com.company;

public class Thriller extends Film {
    final String typ = "Thriller";

    public Thriller(float czasTrwania, String tytul, boolean czyObejrzany) {
        super(czasTrwania, tytul, czyObejrzany);
    }

    public String getTyp() {
        return typ;
    }

    public void dane(){
        System.out.println("type: "+typ+"tytul"+tytul+"czasTrwania"+czyObejrzany);
    }

}
