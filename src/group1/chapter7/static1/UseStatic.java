package group1.chapter7.static1;

public class UseStatic {
    static int a = 3;
    static int b ;

    static  void meth (int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static {
        System.out.println("Статический блок инициализирован.");
        b =  a * 4;
    }




}
