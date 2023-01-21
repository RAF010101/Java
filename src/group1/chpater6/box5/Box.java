package group1.chpater6.box5;

public class Box {
    double height;
    double width;
    double depth;

    double volume() {
        return height * width * depth;

    }

    void setdim(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;


    }


}
