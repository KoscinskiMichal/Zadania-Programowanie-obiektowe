package com.company;

public class Punkt {
    public double x;
    public double y;

    public Punkt() {
        this.x=0;
        this.y=0;
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    void zeruj(){
        this.x=0;
        this.y=0;
    }
    void opis(){
        System.out.println("x="+this.x);
        System.out.println("y="+this.y);
    }
    void przesun(int x,int y){
        this.x+=x;
        this.y+=y;
    }
}
