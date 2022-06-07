package com.company;

public class Command {
    String ciag;

    public Command(String ciag) {
        this.ciag = ciag;
    }

    void operation(){
        System.out.println(ciag);
    }
}
