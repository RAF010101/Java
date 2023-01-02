package group1.chapter4;

public class BootLogic {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a || b;
        boolean d = a && b;
        boolean e = a ^ b;
        boolean f = (!a && b) || (a && !b);
        boolean g = !a;
        System.out.println("a -"+a);//true
        System.out.println("b -"+b);//false
        System.out.println("c -"+c);//true
        System.out.println("d -"+d);//false
        System.out.println("e -"+e);//true
        System.out.println("f -"+f);//true
        System.out.println("g -"+g);//false
    }
}
