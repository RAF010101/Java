package group1.chpater6.box4;

public class Box4 {
    public static void main(String[] args) {
        Box mybox4 = new Box();
        Box mybox5 = new Box();
        mybox4.height = 10;
        mybox4.width = 20;
        mybox4.depth = 15;
        double vol = mybox4.vol();
        System.out.println("Size " + vol);
        mybox5.height = 3;
        mybox5.width = 6;
        mybox5.depth = 9;
        vol = mybox5.vol();
        System.out.println("Size " + vol);
    }
}
