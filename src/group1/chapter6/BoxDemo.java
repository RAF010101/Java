package group1.chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        mybox.depth = 10;
        mybox.height = 20;
        mybox.width = 15;
        vol = mybox.depth * mybox.height * mybox.width;
        System.out.println("Oбъeм равен " + vol);

    }
}
