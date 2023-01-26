package group1.chapter7.test2;

public class OverloadDemo1 {
    void test () {
        System.out.println("Пapaмeтpы отсутствуют");
    }
    void test (int a ,  int b) {
        System.out.println("A and B " + a + " "+ b);
    }
    void test (double a) {
        System.out.println("Bнyтpeннee преобразование при вызове" + "test(a) + ;)" + a);
    }
}
