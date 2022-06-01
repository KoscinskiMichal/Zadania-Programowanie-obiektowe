package com.company;

public class Horror extends Film {
    final String typ = "Horror";

    public Horror(float czasTrwania, String tytul, boolean czyObejrzany) {
        super(czasTrwania, tytul, czyObejrzany);
    }

    public String getTyp() {
        return typ;
    }

    public void dane (){
        System.out.println("typ: "+typ+" tytul "+tytul+" czy obejrzany: "+czyObejrzany);
    }
}
