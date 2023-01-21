package group1.chapter7.box;

public class BoxDemo {
    public static void main(String[] args) {
        double vol;
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box cube = new Box(7);
        System.out.println("Fiest Box volume = " + mybox1.volume());
        System.out.println("Second Box volume =" + mybox2.volume());
        System.out.println("Cube Box volume =" + cube.volume());
    }
}
