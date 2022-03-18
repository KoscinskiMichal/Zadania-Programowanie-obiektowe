package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
          double a,b,c;
        System.out.println("podaj a:");
        a= in.nextDouble();
        System.out.println("podaj b:");
        b= in.nextDouble();
        System.out.println("podaj c:");
        c= in.nextDouble();

        rownanie(a,b,c);
        System.out.println("f(a)= "+fa(a)+"f(b)= "+fb(b)+"f(c)= "+fc(c));

        kolejnosc(a,b,c);

        String deszcz;
        String autobus;
        System.out.println("Czy pada deszcz?  ");
        deszcz = in.next();
        System.out.println("Czy jest autobus?");
        autobus = in.next();

        pogoda(deszcz,autobus);

        String z;
        String p;
        System.out.println("Czy otrzymales znizke  ");
        z = in.next();
        System.out.println("Czy otrzymales premie  ");
        p = in.next();

        samochod(z,p);

    }
    public static void rownanie(double a,double b, double c)
    {
        if(a!=0){

            double delta= b*b -4*a*c;
            double prk= Math.sqrt(delta);

            if(delta<0){
                System.out.println("rownanie nie ma rozwiazan");
            }else if(delta==0){
                System.out.println("rownanie ma jedno rozwiazanie: "+(-b/(2*a)));
            }else{
                System.out.println("x1= "+ ((-b-prk)/(2*a))+"x2= "+((-b+prk)/(2*a)));
            }
        }
    }
    public static double fa (double a){
        if(a>0){
            return 2*a;
        }else if(a==0){
            return 0;
        }else{
            return -(3*a);
        }
    }
    public static double fb (double a){
        if(a>=1){
            return a*a;
        }else{
            return a;
        }
    }
    public static double fc (double a){
        if(a>2){
            return 2+a;
        }else if(a==2){
            return 8;
        }else{
            return a-4;
        }
    }
    public static void kolejnosc(double x,double y,double z){
        double p;
       if(y<x){
           p=y;
           y=x;
           x=p;
       }
       if(z<y){
           p=z;
           z=y;
           y=p;
           if(y<x){
               p=y;
               y=x;
               x=p;
           }
       }
       if(z<x){
           p=z;
           z=x;
           x=p;
       }
        System.out.println("x: "+x+" y: " + y+" z: " + z);
    }
    public static void pogoda (String deszcz, String autobus){
        if(deszcz.equals("tak") && autobus.equals("tak")){
            System.out.println("Wez parasol! "+"Dostaniesz się na uczelnie");
        }else if(deszcz.equals("tak") && !autobus.equals("tak")){
            System.out.println("nie dostaniesz się na uczelnie");
        }else if(!deszcz.equals("tak") && autobus.equals("tak")){
            System.out.println("Dostaniesz się na uczelnie "+"Milego dnia i pieknej pogody");
        }
    }

    public static void samochod(String znizka,String premia) {
        if(!znizka.equals("tak") || premia.equals("tak")){
            System.out.println("Mozesz kupic samochod! "+"Znizki na samochod nie ma");
        } if(!znizka.equals("tak") || !premia.equals("tak")){
            System.out.println("Zakup samochodu trzeba bedzie odlozyc na pozniej... "+"Znizki na samochod nie ma");
        } if(znizka.equals("tak") || premia.equals("tak")){
            System.out.println("Mozesz kupic samochod! ");
        }
    }


}
