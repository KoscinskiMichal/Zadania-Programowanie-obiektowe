package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("txt.txt");
        try {
            Scanner in = new Scanner(System.in);
            String n = in.next();
            while (!n.contains("-")) {
                writer.write(n);
                writer.write(" ");
                n = in.next();
            }
        }finally {
            if (writer != null){
                writer.close();
            }
        }
    }
}
