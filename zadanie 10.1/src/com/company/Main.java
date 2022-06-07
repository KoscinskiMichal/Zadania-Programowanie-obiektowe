package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Kangur> kangury = new ArrayList<>();
        for (int i = 1; i < 15; i++) {
            kangury.add(new Kangur(i));
        }
        Iterator<Kangur> kangurIterator = kangury.iterator();

        while (kangurIterator.hasNext()){
            System.out.println(kangurIterator.next().skok());
        }

        HashMap<String, Kangur> kanguryHash = new HashMap<>();
        kanguryHash.put("Grzes",kangury.get(0));
        kanguryHash.put("Marek",kangury.get(1));
        kanguryHash.put("Agata",kangury.get(2));
        kanguryHash.put("Marysia",kangury.get(3));
        kanguryHash.put("Pawel",kangury.get(4));
        kanguryHash.put("Piotr",kangury.get(5));
        kanguryHash.put("Kacper",kangury.get(6));
        kanguryHash.put("Oliwia",kangury.get(7));
        kanguryHash.put("Bartek",kangury.get(8));
        kanguryHash.put("Kuba",kangury.get(9));
        kanguryHash.put("Karolina",kangury.get(10));
        kanguryHash.put("Ola",kangury.get(11));
        kanguryHash.put("Dominik",kangury.get(12));
        kanguryHash.put("Romek",kangury.get(13));

        Set<String> key = kanguryHash.keySet();
        Iterator<String> hashIterator = key.iterator();


        while (hashIterator.hasNext()){
            String n = hashIterator.next();
            System.out.println(n+" "+kanguryHash.get(n).skok());
        }
        LinkedHashMap<String,Kangur> posortowane = new LinkedHashMap<>(kanguryHash);
        ArrayList<String> sortedkeys = new ArrayList<>(kanguryHash.keySet());
        Collections.sort(sortedkeys);

        for (String klucz: sortedkeys) {
            System.out.println(klucz+kanguryHash.get(klucz).skok());
            posortowane.put(klucz,kanguryHash.get(klucz));
        }

    }
}
