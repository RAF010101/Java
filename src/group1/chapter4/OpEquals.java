package group1.chapter4;

import java.sql.SQLOutput;

public class OpEquals {
    public static void main(String[] args) {
        int a, b, c;
        a = 1;
        b = 2;
        c = 3;
        a += 5;
        b *= 4;
        c += a * b;
        c %= 6;
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("c is " + c);
    }
}
