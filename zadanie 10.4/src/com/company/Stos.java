package com.company;

import java.util.LinkedList;

public class Stos<T> {
    LinkedList<T> stos = new LinkedList<>();

    public void push(T v){
        stos.add(v);
    }
    public T peek(){
        return stos.getFirst();
    }
    public T pop(){
        T p = stos.peek();
        stos.remove(0);
        return p;
    }
    public boolean empty(){
        if (stos.isEmpty()) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Stos{" +
                "stos=" + stos +
                '}';
    }

}
