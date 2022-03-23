package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println(zad1());
        //zad2();
        System.out.println(zad3());
    }

    public static int wczytaj(){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("podaj liczbe n");
        n = in.nextInt();
        return n;
    }

    public static double zad1() {
        Scanner in = new Scanner(System.in);
        double n = wczytaj();
        double s = 0;
        int i = 0;
        while (i < n) {
            System.out.printf("punkty " + (i + 1) + " studenta: ");
            double p = in.nextDouble();
            s += p;
            i++;
        }
        double sr = s / n;
        return sr;
    }
    public static void zad2(){
        int d=0,u=0;
        int sd=0,su=0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.printf("podaj "+(i+1)+ " liczbe: ");
            double l = in.nextDouble();
            if(l>0){
                d++;
                sd += l;
            }else if (l<0){
                u++;
                su += l;
            }
        }
        System.out.println("suma dodatnich: "+(sd)+" liczba dodatnich: "+(d)+" suma ujemnych: "+(su)+" 1liczba ujemnych: "+(u));
    }
    public static double zad3(){
        int n = wczytaj();
        double suma=0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("podaj "+(i+1)+" liczbe: ");
            double l = in.nextDouble();
            if(l%2==0){
                suma += l;
            }
        }
        return suma;
    }
    public static void zad4(){

    }




}
