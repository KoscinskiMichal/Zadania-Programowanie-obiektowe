package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static List<Uczestnik> listaUczestnikow = new LinkedList<>();
    private static List<Uczestnik> lista = new ArrayList<>();

    public static void main(String[] args) {

        Uczestnik pierwszy = new Uczestnik("pawel",1,16);
        Uczestnik drugi = new Uczestnik("marek",2,16);




        listaUczestnikow.

        for (Uczestnik e:listaUczestnikow) {
            System.out.println(e.toString());
        }


    }


    public boolean addlinked(int ID, String imie, int wiek) {
        if(wiek > 18) {
            return listaUczestnikow.add(new Uczestnik(imie, ID, wiek));
        }
        return false;
    }
    public static boolean addarray(int ID, String imie, int wiek) {
        if(wiek > 18) {
            return lista.add(new Uczestnik(imie, ID, wiek));
        }
        return false;
    }
}

