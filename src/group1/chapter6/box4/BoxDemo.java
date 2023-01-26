package group1.chapter6.box4;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        Box mybox2 = new Box();
        mybox.height = 10;
        mybox.width = 20;
        mybox.depth = 15;
        double vol = mybox.volume();
        System.out.println("Oбъeм равен " + vol);
        mybox2.height = 3;
        mybox2.width = 6;
        mybox2.depth = 9;
        vol = mybox2.volume();
        System.out.println("Oбъeм равен " + vol);
    }
}
