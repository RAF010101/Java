package group1.chapter7.test1;

public class OverloadDemo {
    public void test() {
        System.out.println("Пapaмeтpы отсутствуют");
    }

    void test(int a) {
        System.out.println("A is a " + a);
    }

   public void test(int a, int b) {
        System.out.println("A is a" + a + "B is a " + b);
    }

    double test(double a) {
        System.out.println(a + "*" + a);
    return a * a;
    }

}
