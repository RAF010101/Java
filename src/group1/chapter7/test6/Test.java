package group1.chapter7.test6;

public class Test {
    public static void main(String[] args) {
        TestDemo ob1 = new TestDemo(122);
        TestDemo ob2 ;
        ob2 = ob1.incrbyten();
        System.out.println("ob1 a = " + ob1.a);
        System.out.println("ob2 a = " + ob2.a );
    }
}
