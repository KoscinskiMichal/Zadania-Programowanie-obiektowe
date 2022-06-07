package com.company;

public class Main {

    public static void main(String[] args) {
	    kolejka kolejka = new kolejka();
        konsumuj konsumuj = new konsumuj();
        konsumuj.pisz(kolejka.wypelnij());
    }
}
