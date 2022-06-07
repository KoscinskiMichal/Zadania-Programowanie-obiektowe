package com.company;

import java.util.LinkedList;


public class kolejka {


    public LinkedList<Command> wypelnij(){
        LinkedList<Command> kolejka = new LinkedList<>();
        kolejka.add(new Command("pierwszy"));
        kolejka.add(new Command("drugi"));
        kolejka.add(new Command("trzeci"));
        kolejka.add(new Command("czwarty"));
        kolejka.add(new Command("piaty"));
        return kolejka;
    }
}
