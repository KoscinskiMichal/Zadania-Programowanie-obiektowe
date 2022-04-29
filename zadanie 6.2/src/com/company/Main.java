package com.company;

public class Main {

    public static void main(String[] args) {
	    SamochodOsobowy car =new SamochodOsobowy();
        Samochod autko = new Samochod();
        Samochod rangerover = new Samochod("land rover","defender","suv","zolty",2012,170000);


        car.opis();
        autko.opis();
        rangerover.opis();
    }
}
