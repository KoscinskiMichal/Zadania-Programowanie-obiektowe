package com.company;

public class Okrag extends Figura {
   // Punkt srodek=new Punkt();
    double r=0;

    public Okrag() {

    }

    public Okrag(Punkt srodek, double r) {
        this.punkt.x = srodek.x;
        this.punkt.y = srodek.y;
        this.r = r;
    }

    public double getPowierzchnia(){
        return Math.PI*r*r;
    }
    public double getSrednica(){
        return 2*r;
    }
    public void setPromien(double p){
        this.r=p;
    }

    public double getPromien() {
        return r;
    }

    public boolean wSrodku(Punkt pkt){
        if (Math.pow(pkt.x-punkt.x,2)+Math.pow(pkt.y-punkt.y,2)<=r*r){
            return true;
        }else return false;
    }

}
