package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Powiesc harry = new Powiesc("Jk Rowling","Harry Potter","Harry rozpoczyna pierwszy rok ...",30,1998,12,240,"Fantasy");
        Podrecznik fizykakwantowa = new Podrecznik("Jan Kowalski","Fizyka kwantowa dla przedszkolakow","Fizyka kwantowa od najmlodszych lat...",40,2012,"Fizyka",8,160);
        Klient michal = new Klient("Michał",100);
        Ksiegarnia nowa = new Ksiegarnia(new Ksiazka[]{harry,fizykakwantowa},"nowa");
        System.out.println("Witamy w ksiagarni");
        for (int i = 0; i < nowa.polka.length; i++) {
            System.out.print(i+1 + ".");nowa.polka[i].info();
        }

        Scanner in = new Scanner(System.in);

        int w = in.nextInt()-1;

        michal.kup(nowa.polka[w]);

        int w1= in.nextInt()-1;

        michal.kup(nowa.polka[w1]);

        if(w==w1){
            nowa.paragon(new Ksiazka[]{nowa.polka[w]});
        }else nowa.paragon(new Ksiazka[]{nowa.polka[w],nowa.polka[w1]});

    }
}
