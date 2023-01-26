package group1.chapter7.test2;

import group1.chapter7.test1.OverloadDemo;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo1 ob  =  new OverloadDemo1();
         int i = 88;
        ob.test();
        ob.test(10 , 20);
        ob.test(i);
        ob.test(10.0);
    }
}
