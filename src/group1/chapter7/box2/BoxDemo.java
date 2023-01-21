package group1.chapter7.box2;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box(20,10,15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);
        System.out.println("First Box volume  =" + mybox1.volume());
        System.out.println("Second Box volume = " +mybox2.volume());
        System.out.println("Third Box volume = "+ mybox3.volume());

    }
}
