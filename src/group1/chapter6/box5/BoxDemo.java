package group1.chapter6.box5;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        Box mybox2 =new Box();
        mybox.setDim(10,20,15);
        double vol = mybox.volume();
        System.out.println("Oбъeм равен " + vol);
        mybox2.setDim(3,6,9);
        vol = mybox2.volume();
        System.out.println("Oбъeм равен " + vol);
    }
}
