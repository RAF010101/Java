package group1.chapter7.stack;

public class TestStack {
    public static void main(String[] args) {
        Stack ob1  = new Stack();
        Stack ob2 = new Stack();
        for (int i = 0; i < 10; i++) {
            ob1.push(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(ob1.pop() + " ");
        }
        System.out.println();
        for (int i = 10; i <=100 ; i += 10) {
             ob2.push(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(ob2.pop() + " ");

        }
    }
}
