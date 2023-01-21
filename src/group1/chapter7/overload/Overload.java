package group1.chapter7.overload;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob  = new OverloadDemo();
        ob.Test();
        ob.Test(7);
        ob.Test(7,15);
        double a = ob.Test(7.0);
        System.out.println("a " + a);

    }
}
