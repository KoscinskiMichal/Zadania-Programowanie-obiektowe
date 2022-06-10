package com.company;

import java.time.Clock;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    String[] polka = {"mleko","woda","jajka","ciastka","owoce","chleb","piwo","pomidor","makaron","nutella"};
        Stos<String> koszyk = new Stos<>();
        Random random = new Random();
        int a = random.nextInt(15);
        for (int i = 0; i <= a; i++) {
            int b = random.nextInt(0,9);
            koszyk.push(polka[b]);
        }
        ArrayDeque<Stos> kolejka = new ArrayDeque<Stos>();
        int c = random.nextInt(10);
        kolejka.add(koszyk);
        for (int i = 0; i < c; i++) {
            kolejka.add(new Stos());
        }

        for (int i = 0; i <= c; i++) {
            System.out.println("Klient nr "+i);
            System.out.println(kolejka.getLast().toString());
            kolejka.removeLast();
        }

    }
}
