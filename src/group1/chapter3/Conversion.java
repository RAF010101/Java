package group1.chapter3;

import java.io.FilterOutputStream;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        b = (byte) i;
        System.out.println(b + " " + i);
        i = (int) d;
        System.out.println(d + " " + i);
        b = (byte) d;
        System.out.println(b + " " + d);


    }
}
