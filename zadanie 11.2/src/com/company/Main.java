package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	    int linie = 0;
        BufferedReader reader = new BufferedReader(new FileReader("txt.txt"));
        String linia = reader.readLine();
        while (linia != null){
            System.out.println(linia);
            linie++;
            linia = reader.readLine();
        }
        System.out.println("ilosc linie tekstu= "+linie);
        reader.close();
    }
}
