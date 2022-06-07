package com.company;

import java.util.LinkedList;


public class konsumuj {

    public void pisz(LinkedList<Command> kolejka){
        for (Command c:kolejka) {
            c.operation();
        }
    }
}
