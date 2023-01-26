package group1.chapter6.box7;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox  = new Box(10,20,15);
        Box mybox2 = new Box(3, 6 , 9);
        double vol = mybox.vol();
        System.out.println("Oбъeм равен " + vol);
        vol = mybox2.vol();
        System.out.println("Oбъeм равен " + vol);
    }
}
