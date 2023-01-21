package group1.chpater6.box7;

public class Box7 {
    public static void main(String[] args) {
        Box mybox7 = new Box(10,20,15);
        Box mybox8 = new Box(3,6,9);
        double vol = mybox7.volume();
        System.out.println("Oбъeм равен " + vol );
        vol = mybox8.volume();
        System.out.println("Oбъeм равен " + vol );
    }
}
