package group1.chpater6.box6;

import com.sun.jdi.JDIPermission;

public class Box {
    double height;
    double width;
    double depth;
    Box(){
        System.out.println("Oбъeм равен ");
        height = 10;
        width = 10;
        depth = 10;
    }
    double volume(){
        return height * width * depth;
    }


}
