package group1.chapter6.box2;

import java.sql.SQLOutput;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        mybox1.height = 10;
        mybox1.width = 20;
        mybox1.depth = 15;
        double vol = mybox1.height * mybox1.width * mybox1.depth;
        System.out.println("Oбъeм равен " + vol);
        mybox2.height = 3;
        mybox2.width = 6;
        mybox2.depth = 9;
        vol = mybox2.height * mybox2.width * mybox2.depth;
        System.out.println("Oбъeм равен " + vol);
    }
}
