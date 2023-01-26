package group1.chapter7.box1;

public class BoxDemo {
    double height;
    double width;
    double depth;
    BoxDemo (double h, double w, double d){
        height = h;
        width = w;
        depth = d;
    }
    BoxDemo (){
        height = -1;
        width = -1;
        depth = - 1;
    }
    BoxDemo (double len) {
        height = depth = width = len;
    }

    double volume (){
        return height * width * depth;
    }
}
