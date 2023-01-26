package group1.chapter7.test3;

public class Test {
    public static void main(String[] args) {
        TestDemo ob1  = new TestDemo(100,22);
        TestDemo ob2 = new TestDemo(100,22);
        TestDemo ob3 = new TestDemo(-1,-2);
        System.out.println(ob1.equalTo(ob2));
        System.out.println(ob2.equalTo(ob3));
    }
}
