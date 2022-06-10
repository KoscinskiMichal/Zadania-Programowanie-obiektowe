package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String nazwa = in.next();
        System.out.println("podaj date urodzenia");
        int dzien = Integer.parseInt(in.next());
        int miesiac = Integer.parseInt(in.next());
        int rok = Integer.parseInt(in.next());
        DataOutputStream binarne = new DataOutputStream(new FileOutputStream(nazwa));
        binarne.writeInt(dzien);
        binarne.writeInt(miesiac);
        binarne.writeInt(rok);

        DataInputStream wypisz = new DataInputStream(new FileInputStream(nazwa));
        wypisz.read();

    }
}
