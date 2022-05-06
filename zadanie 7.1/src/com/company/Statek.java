package com.company;

public class Statek implements Plywa {
    String nazwa;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void plyn(){
        System.out.println(this.nazwa+ " plynie");
    }


}
