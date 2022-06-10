package com.company;

public class Main {

    public static void main(String[] args) {
	    String wyr = "+B+a+l---+a+g+a---+n-+w-+l+i+t---+e-+r+k--+a+c+h---";
        Stos<Character> stos = new Stos<>();
        for (int i = 0; i < wyr.length(); i++) {
            if ( wyr.charAt(i) == '+'){
                stos.push(wyr.charAt(i+1));
            }
            if (wyr.charAt(i)=='-'){
                System.out.println(stos.pop());
            }
        }
    }
}
