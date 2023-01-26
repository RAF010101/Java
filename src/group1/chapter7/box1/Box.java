package group1.chapter7.box1;

public class Box {
    public static void main(String[] args) {
        BoxDemo ob1 = new BoxDemo(10,20,15);
        BoxDemo ob2 = new BoxDemo();
        BoxDemo ob3 = new BoxDemo(7);
        double vol = ob1.volume();
        System.out.println("ob1 vol = " + vol);
        vol = ob2.volume();
        System.out.println("ob2 vol = " + vol);
        vol = ob3.volume();
        System.out.println("ob2 vol = " + vol );
    }
}
