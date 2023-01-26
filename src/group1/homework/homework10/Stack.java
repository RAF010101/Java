package group1.homework.homework10;

public class Stack {
    private  char[] ch1 = new char[100];
    private int tos;
    Stack (){
        tos = -1;
    }
    void push (char c) {
        if (tos > ch1.length -1){
            System.out.println("No pleace");
        }ch1[++tos] = c;
    }
    char pop (){
        if (tos  < 0) {
            System.out.println(" ");
            return 'x';
        }return ch1[tos--];
    }
}
