package com.company;

public class Main {

    public static void main(String[] args) {
	    Punkt pkt1=new Punkt();
        Punkt pkt2=new Punkt();
        Punkt pkt3=new Punkt();
        Okrag okr =new Okrag();

        pkt1.getX();
        pkt2.opis();
        pkt3.przesun(2,3);


        Figura f1 = new Figura();
        Trojkat t1 = new Trojkat(5,6);
        Prostokat p1 = new Prostokat(8,6);

        System.out.println(f1.opis());
        System.out.println(p1.getPowierzchnia());



    }
}
