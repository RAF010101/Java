package group1.chapter6.box1;

public class BoxDemo {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.height = 10;
        box1.width = 20;
        box1.depth = 15;
        double vol = box1.height * box1.width * box1.depth;
        System.out.println("Oбъeм равен " + vol);

    }
}