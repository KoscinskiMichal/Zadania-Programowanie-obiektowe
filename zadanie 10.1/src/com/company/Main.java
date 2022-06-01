package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Thriller deathnote = new Thriller(14,"Death Note",false);
        Horror pila = new Horror(2,"Piła",false);
        Thriller gurren = new Thriller(2,"Gurren Lagann",false);
        Horror aot = new Horror(40,"Shingeki na kyiojin",true);
        Horror paprika = new Horror(2,"Paprika",false);
        Map<Integer,Film> filmy = new HashMap<>();
        filmy.put(1,deathnote);
        filmy.put(2,pila);
        filmy.put(3,gurren);
        filmy.put(4,aot);
        filmy.put(5,paprika);


        for(Map.Entry<Integer, Film> entry : filmy.entrySet()) {
            System.out.println(entry.toString());
        }



    }
}
