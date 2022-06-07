package com.company;

public class Film {
    private float czasTrwania;
    String tytul;
    boolean czyObejrzany;

    public Film(float czasTrwania, String tytul, boolean czyObejrzany) {
        this.czasTrwania = czasTrwania;
        this.tytul = tytul;
        this.czyObejrzany = czyObejrzany;
    }

    public float getCzasTrwania() {
        return czasTrwania;
    }

    public String getTytul() {
        return tytul;
    }

    public boolean isCzyObejrzany() {
        return czyObejrzany;
    }

    public void setCzasTrwania(float czasTrwania) {
        this.czasTrwania = czasTrwania;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setCzyObejrzany(boolean czyObejrzany) {
        this.czyObejrzany = czyObejrzany;
    }

    @Override
    public String toString() {
        return "Film{" +
                "czasTrwania=" + czasTrwania +
                ", tytul='" + tytul + '\'' +
                ", czyObejrzany=" + czyObejrzany +
                '}';
    }
}
