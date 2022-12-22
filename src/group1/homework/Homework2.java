package group1.homework;

public class Homework2 {
    public static void main(String[] args) {
        int a = 70, b = 80;
        for (int i = a; i <= b; i++) {
            System.out.println(a);
            a++;

        }
        System.out.println("*_*");
        char ch1, ch2;
        ch1 = (char) a;
        ch2 = (char) b;
        System.out.println(ch1 + " " + ch2);
        System.out.println("*_*");
        if(a == b) System.out.println("A score = B");
        else System.out.println("A score < B");
        System.out.println("Finish *_*");


    }

}
