package group1.chpater6.box1;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        mybox.height = 10;
        mybox.width = 15;
        mybox.depth = 20;
        double  vol = mybox.height * mybox.width * mybox.depth;
        System.out.println("Oбъeм равен " + vol);
    }


}
