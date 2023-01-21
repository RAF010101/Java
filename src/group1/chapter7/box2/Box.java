package group1.chapter7.box2;

public class Box {
    double height;
    double width;
    double depth;

    Box(double h, double w , double d){
        height = h;
        width = w;
        depth = d;
    }

    Box() {
        height = -1;
        width = -1;
        depth = -1;
    }

    Box(double len) {
        height = width = depth = len;
    }

    double volume() {
        return height * width * depth;
    }
}
