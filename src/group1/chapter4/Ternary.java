package group1.chapter4;

public class Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.println("Aбcoлютнoe значение");
        System.out.println(i + " равно " + k);
        k = i < 0 ? i : -i;
        System.out.println("Aбcoлютнoe значение");
        System.out.println(k + " равно " + i);
    }
}
