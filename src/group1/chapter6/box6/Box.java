package group1.chapter6.box6;

public class Box {
    double height;
    double width;
    double depth;
    Box (){
        height = 10;
        width = 10;
        depth = 10;
    }
    double vol () {
        return height * width * depth;
    }

}
