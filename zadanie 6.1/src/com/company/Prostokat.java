package com.company;
class Prostokat extends Figura  {
	double wys=0, szer=0;

	Prostokat(){

	}
	
	Prostokat(double wys,double szer){
		this.wys = wys;
		this.szer = szer;
			
	}

	Prostokat(String kolor, double wys, double szer) {
		super(kolor);
		this.wys = wys;
		this.szer = szer;
	}

	double getPowierzchnia() {
        return (szer * wys);
    }

	void przesun(float x,float y){
		this.punkt.x+=x;
		this.punkt.y+=x;
	}
	String opis(){
		return "Klasa Prostokat. Kolor obiektu: "+kolor+"wys="+wys+"szer="+szer;
	}
    
}