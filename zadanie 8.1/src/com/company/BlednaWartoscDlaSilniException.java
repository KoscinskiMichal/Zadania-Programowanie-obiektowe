package com.company;

public class BlednaWartoscDlaSilniException extends Exception{

    public BlednaWartoscDlaSilniException(String message) {
        super(message);
    }

    public static void main(String[] args) throws BlednaWartoscDlaSilniException {
        System.out.println(silnia(3));

    }
    public static int silnia(int n)throws BlednaWartoscDlaSilniException {
        int sil = 1;
        if(n<0) {
            throw new BlednaWartoscDlaSilniException("Podano ujemna liczbe");
        }
        for (int i = n; i > 0; i--) {
            sil = sil * i;
        }
        return sil;
    }
}


