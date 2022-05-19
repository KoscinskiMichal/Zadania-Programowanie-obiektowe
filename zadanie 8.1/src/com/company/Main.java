package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 0;
        while(true){
            try {
                a = in.nextDouble();
                break;
            }
            catch (InputMismatchException e){
                System.out.println("Podaj poprawna liczbe");
                in.next();
            }
        }
        if (a<0){
            throw new IllegalArgumentException(String.format("Podano ujemna liczbe",a));
        }
        System.out.println(String.format("Pierwiastek z %.4f to %.4f",a,Math.sqrt(a)));


    }
}
