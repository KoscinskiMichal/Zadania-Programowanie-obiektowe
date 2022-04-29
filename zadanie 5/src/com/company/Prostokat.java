package com.company;


public class Prostokat {
    double a,b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void pole(){
        System.out.println("pole: "+ a*b);
    }
    public void obwod(){
        System.out.println("obwod: "+ (2*a+2*b) );
    }
    public void przekatna(){
        System.out.println("przekatna: "+ Math.sqrt(a*a+b*b));
    }


}
