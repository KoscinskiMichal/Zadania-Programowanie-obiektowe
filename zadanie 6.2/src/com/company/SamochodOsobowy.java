package com.company;


import java.util.Scanner;

public class SamochodOsobowy extends Samochod {
    double waga,silnik;
    int osoby;

    public SamochodOsobowy() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wage ");
        double w = in.nextDouble();
        while(w<2||w>4.5){
            System.out.println("waga nie miesci sie w przedziale(2t--4,5t)");
            System.out.println("Podaj wage ");
            w = in.nextDouble();
        }
        this.waga=w;
        System.out.println("Podaj pojemnosc silnika");
        double s =in.nextDouble();
        while(s<0.8||s>3){
            System.out.println("poj. silnika nie miesci sie w przedziale (0,8l-3l)");
            System.out.println("Podaj pojemnosc silnika");
            s =in.nextDouble();
        }
        this.silnik=s;
        System.out.println("Podaj ilosc osob ");
        this.osoby = in.nextInt();
    }

    void opis() {
        super.opis();
        System.out.println("waga: "+waga+"t"+"\npoj.silnika: "+silnik+"l"+"\nilosc osob: "+osoby);
    }
}
