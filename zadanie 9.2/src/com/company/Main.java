package com.company;


import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Piesek[] pieski = {new Piesek("pitbull",5,30),new Piesek("rottwiler",3,20),new Piesek("samoyed",4,40),new Piesek("chiuaua",1,3)};

    List<Piesek> pjeski = new LinkedList<Piesek>(List.of(pieski));

    var subpjeski= pjeski.subList(2,4);

        for (Piesek p:subpjeski) {
            System.out.println(p.nazwa);
        }

        System.out.println("");
        pjeski.subList(2,4).clear();


        for (Piesek e:pjeski) {

            System.out.println(e.nazwa);
        }

    }
}
