package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println(zad1());
        //zad2();
        //System.out.println(zad4());
        System.out.println(zad5("kajak"));
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
        int n = wczytaj();
        double s = 0;
        int i = 0;
        while (i < n) {
            System.out.print("punkty " + (i + 1) + " studenta: ");
            double p = in.nextDouble();
            s += p;
            i++;
        }
        return s / n;
    }
    public static void zad2(){
        int d=0,u=0;
        int sd=0,su=0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("podaj "+(i+1)+ " liczbe: ");
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
            System.out.print("podaj "+(i+1)+" liczbe: ");
            double l = in.nextDouble();
            if(l%2==0){
                suma += l;
            }
        }
        return suma;
    }
    public static double zad4(){
        int n = wczytaj();
        double suma=0;
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int l = rand.nextInt(56)-10;
            System.out.println((i+1)+":  "+l);
            if(l%2==0){
                suma += l;
            }
        }
        return suma;
    }
    public static boolean zad5(String t){
        int n = t.length();
        for (int i = 0; i < n/2; i++) {
            char z = t.charAt(i);
            char k = t.charAt((n-1)-i);
            if(z != k){
                return false;
            }
        }
        return true;
    }





}
