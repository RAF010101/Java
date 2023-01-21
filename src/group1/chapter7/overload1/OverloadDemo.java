package group1.chapter7.overload1;

public class OverloadDemo {
    public static void main(String[] args) {
        Overload ob1 = new Overload();
        int i = 88;
        ob1.Test(i);
        ob1.Test(36,88);
        ob1.Test(88);

    }
}
