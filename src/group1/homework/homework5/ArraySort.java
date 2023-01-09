package group1.homework.homework5;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] a = {43, 55, 5, -9, 0, 12, 5, 65};
        int count;
        do {
            count = 0;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    count++;
                }
            }
        } while (count > 0);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +  ",");
        }

    }
}






