package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        List<Integer> inty = List.of(1,2,3,4,5,6,7,8);
        List<Integer> inty2 = new ArrayList<Integer>();

        ListIterator<Integer> iteratorinty = inty.listIterator(inty.size());

        while (iteratorinty.hasPrevious()){
            inty2.add(iteratorinty.previous());
        }

        for (int a:inty2) {
            System.out.println(a);
        }

    }
}
