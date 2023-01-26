package group1.chapter7.test4;

public class CallByVallue {
    public static void main(String[] args) {
        Test ob1 = new Test();
        int a = 15, b = 20;
        System.out.println(a + " " + b);
        ob1.meth(a , b);
        System.out.println(a + ' ' + b);
    }
}
