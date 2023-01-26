package group1.chapter7.test5;

public class CallByVallue {
    public static void main(String[] args) {
        Test ob1 = new Test(15,20);
        System.out.println(ob1.a + " " + ob1.b);
        ob1.meth(ob1);
        System.out.println(ob1.a + " " + ob1.b);
    }
}
