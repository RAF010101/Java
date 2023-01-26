package group1.chapter6.box7;

public class Box {
    double height;
    double width;
    double depth;
    Box (double h , double w , double d){
        height = h;
        width = w;
        depth = d;
    }
    double vol () {
        return height * width * depth;
    }
}
