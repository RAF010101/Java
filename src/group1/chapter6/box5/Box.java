package group1.chapter6.box5;

public class Box {
    double height;
    double width;
    double depth;
     double volume (){
         return height * width * depth;
     }
     void setDim(double h, double w, double d){
         height = h;
         width = w;
         depth = d;
     }
}
