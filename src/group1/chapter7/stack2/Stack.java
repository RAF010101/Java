package group1.chapter7.stack2;

public class Stack {
    private int[] stck = new int[10];
    private int tos;
    Stack (int size) {
        stck = new int [size];
        tos = - 1;
    }
    void push ( int item) {
        if (tos == stck.length - 1) {
            System.out.println("Cтeк заполнен.");
        }else stck[++tos] = item;
    }
     int pop () {
        if (tos < 0){
            System.out.println("Stack is a full");
            return 0;
        }else return stck[tos--];
     }
}
