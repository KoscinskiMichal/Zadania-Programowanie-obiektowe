package com.company;

public class Wieloryb extends Ryba{
    String nazwa;

    public Wieloryb(String nazwa){
        this.nazwa = nazwa;
    }
    public void  jedz() {
        System.out.println(this.nazwa+" je");
    }
    public void wydalaj(){
        System.out.println(this.nazwa+" wydala");
    }
    public void plyn(){
        System.out.println(this.nazwa+" plynie");
    }
    public void zanurz() {
        System.out.println(this.nazwa+" zanurza sie");
    }
    public void wynurz() {
        System.out.println(this.nazwa+" wynurza sie");
    }
}
