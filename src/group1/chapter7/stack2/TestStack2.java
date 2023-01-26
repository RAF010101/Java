package group1.chapter7.stack2;

public class TestStack2 {
    public static void main(String[] args) {
        Stack ob1 = new Stack(20);
        Stack ob2 = new Stack(5);
        for (int i = 1; i <= 20; i++) {
            ob1.push(i);
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(ob1.pop() + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            ob2.push(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(ob2.pop() + " ");

        }
    }
}
