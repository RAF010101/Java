package group1.chapter7.factorial2;

public class RecTest {
    int values [];

    RecTest (int i) {
        values = new int[i];
    }
    void printarray (int i) {
        if (i == 0) return;
        else printarray(i - 1);
        System.out.println("[" + (i - 1) + "]" + values [i - 1]);
    }


}
