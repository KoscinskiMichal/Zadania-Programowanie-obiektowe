package com.company;

public class Samochod {
    String nazwa;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void jedz(){
        System.out.println(this.nazwa+" jedzie");
    }
}
