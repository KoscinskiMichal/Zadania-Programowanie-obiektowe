package com.company;

public class Okrag {
    Punkt srodek;
    double r=0;

    public Okrag() {
    }

    public Okrag(Punkt srodek, double r) {
        this.srodek.x = srodek.x;
        this.srodek.y = srodek.y;
        this.r = r;
    }

    public double getPowierzchnia(){
        return Math.PI*r*r;
    }
    public double getSrednica(){
        return 2*r;
    }
    public void setPromien(double promien){
        this.r=promien;
    }
    public boolean wSrodku(Punkt pkt){
        if (Math.pow(pkt.x-srodek.x,2)+Math.pow(pkt.y-srodek.y,2)<=r*r){
            return true;
        }else return false;
    }

}
