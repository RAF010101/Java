package group1.chapter6.box3;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        mybox1.height = 10;
        mybox1.width = 20;
        mybox1.depth = 15;
        mybox1.volume();
        mybox2.height = 3;
        mybox2.width = 6;
        mybox2.depth = 9;
        mybox2.volume();
    }
}
