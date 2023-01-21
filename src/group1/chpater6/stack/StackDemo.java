package group1.chpater6.stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack mystack = new Stack();
        Stack mystack2 = new Stack();
        for (int i = 0; i < 10; i++) {
            mystack.push(i);
        }
        for (int i = 20; i > 10; i--) {
            mystack2.push(i);
        }
        System.out.println("MYSTACK1");
        for (int i = 0; i < 10; i++) {
            System.out.print(mystack.pop() + " ");
        }
        System.out.println("\nMYSTACK2");
        for (int i = 0; i < 10; i++) {
            System.out.print(mystack2.pop() + " ");

        }
    }
}





