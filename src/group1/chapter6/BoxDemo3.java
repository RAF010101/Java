package group1.chapter6;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box my1box = new Box();
        Box my2box = new Box();
        my1box.width = 10;
        my1box.height = 20;
        my1box.depth = 15;
        my2box.width = 3;
        my2box.height = 6;
        my2box.depth = 9;
        my1box.volume();
        my2box.volume();
    }
}
