package group1.chpater6.box5;

public class Box5 {
    public static void main(String[] args) {
        Box mybox5 = new Box();
        Box mybox6 = new Box();
        mybox5.setdim(10, 20, 15);
        mybox6.setdim(3, 6, 9);
        double vol = mybox5.volume();
        System.out.println("Oбъeм равен " + vol);
        vol = mybox6.volume();
        System.out.println("Oбъeм равен " + vol);
    }
}
