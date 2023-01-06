package group1.chapter5;

public class While {
    public static void main(String[] args) {
        int n = 10;
        while (n > 0) {
            System.out.print("такт " + n + " ");
            n--;
        }
        System.out.println();
        int i = 0;
        while (i <10){
            i++;
            System.out.print("такт " +i + " ");
        }
    }
}