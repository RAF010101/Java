package group1.chapter7.test1;

public class Overload {
    public static void main(String[] args) {
      OverloadDemo ob = new OverloadDemo();
        double result;
      ob.test();
      ob.test(10);
      ob.test(10,20);
      result = ob.test(10.0);
        System.out.println(result);
    }
}
