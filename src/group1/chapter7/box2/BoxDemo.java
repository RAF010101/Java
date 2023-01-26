package group1.chapter7.box2;

import group1.chapter7.test3.TestDemo;

public class BoxDemo {
    double height;
    double width;
    double depth;
    BoxDemo (BoxDemo ob) {
        height = ob.height;
        width = ob.width;
        depth = ob.depth;
    }
    BoxDemo(double h, double w , double d){
        height = h;
        width = w;
        depth = d;
    }
    BoxDemo(double len) {
        height = width = depth = len;
    }
    double volume (){
        return height * width * depth;
    }

}
