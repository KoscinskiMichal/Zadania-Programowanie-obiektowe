package com.company;



public class Main {

    public static void main(String[] args) {
	    Powiesc harry = new Powiesc("Jk Rowling","Harry Potter","Harry rozpoczyna pierwszy rok ...",30,1998,12,240,"Fantasy");
        Podrecznik fizykakwantowa = new Podrecznik("Jan Kowalski","Fizyka kwantowa dla przedszkolakow","Fizyka kwantowa od najmlodszych lat...",40,2012,"Fizyka",8,160);
        Klient michal = new Klient("Michał",100);
        Ksiazka PanTadeusz = (Ksiazka) new Powiesc("Adam Mickiewicz","Pan Tadeusz, czyli ostatni zajazd na Litwie","Pan Tadeusz wraca...",50,1834,12,250,"epika");



        Ksiegarnia nowa = new Ksiegarnia(new Ksiazka[]{harry,fizykakwantowa},"nowa");


        System.out.println("Witamy w ksiagarni");
        for (int i = 0; i < nowa.polka.length; i++) {
            System.out.print(i+1 + ".");nowa.polka[i].info();
        }


        if(PanTadeusz instanceof Powiesc){
            Powiesc PanT = (Powiesc)PanTadeusz;
            PanTadeusz.info();
            michal.kup(PanT);
        }

        michal.kup(nowa.polka[1]);


        michal.kup(nowa.polka[0]);



        nowa.paragon(new Ksiazka[]{PanTadeusz,nowa.polka[1]});

    }
}
