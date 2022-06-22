package com.company;

import java.io.*;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String nazwa = in.next();
        System.out.println("podaj date urodzenia");
        int dzien = in.nextInt();
        int miesiac = in.nextInt();
        int rok = in.nextInt();
        DataInputStream wypisz = null;
        try {
        DataOutputStream binarne = new DataOutputStream(new FileOutputStream(nazwa));
        binarne.writeInt(dzien);
        binarne.writeInt(miesiac);
        binarne.writeInt(rok);

            wypisz = new DataInputStream(new FileInputStream(nazwa));
            System.out.println(wypisz.readInt());

        }catch (IOException e){
            e.getMessage();
        }finally {
            if (wypisz!=null){
                wypisz.close();
            }

        }
    }
}
