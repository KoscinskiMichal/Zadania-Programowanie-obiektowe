package com.company;

import java.util.Scanner;

public class kalkulator {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a,b;
        System.out.println("podaj a: ");
        a=in.nextDouble();
        System.out.println("podaj b: ");
        b=in.nextDouble();

        System.out.println("poda dzialanie ktore chcesz wykonac(+,-,*,/,%): ");
        String opcja = in.next();

        switch (opcja){
            case "+":
                System.out.println("wynik: " +(a+b));
                break;
            case "-":
                System.out.println("wynik: "+ (a-b));
                break;
            case "*":
                System.out.println("wynik: "+ (a*b));
                break;
            case "/":
                System.out.println("wynik: "+ (a/b));
                break;
            case "%":
                System.out.println("wynik: "+ (a%b));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + opcja);
        }
    }
}
