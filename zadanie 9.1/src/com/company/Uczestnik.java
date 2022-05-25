package com.company;

import java.awt.*;
import java.util.LinkedList;
import java.util.Objects;

public class Uczestnik {
    String imie;
    int ID, wiek;

    public Uczestnik(String imie, int ID, int wiek) {
        this.imie = imie;
        this.ID = ID;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Uczestnik{" +
                "imie='" + imie + '\'' +
                ", ID=" + ID +
                ", wiek=" + wiek +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczestnik uczestnik = (Uczestnik) o;
        return ID == uczestnik.ID && wiek == uczestnik.wiek && Objects.equals(imie, uczestnik.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, ID, wiek);
    }




}
