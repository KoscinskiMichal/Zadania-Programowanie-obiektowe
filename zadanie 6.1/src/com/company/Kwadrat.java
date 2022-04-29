package com.company;

public class Kwadrat extends Prostokat {
    public void setWys(double wys){
        this.wys=wys;
    }
    public void setSzer(double szer){
        this.szer=szer;
    }
    public double getWys(){
        return wys;
    }
    public double getSzer(){
        return szer;
    }
    String opis(){
        return "Klasa Kwadrat. Kolor obiektu: "+kolor+"wys="+wys+"szer="+szer;
    }

}
