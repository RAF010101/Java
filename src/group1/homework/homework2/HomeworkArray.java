package group1.homework.homework2;

import javax.swing.*;

public class HomeworkArray {
    public static void main(String[] args) {
        int[] array = {6, 9, 20, 80, 61, 79, 83, 57, 66};
        System.out.println(array[0]);
        int lastelement = array.length - 1;
        System.out.println(lastelement);
        System.out.println("lastindex " + array[lastelement]);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(",");
            } else System.out.print(":");
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        System.out.println();
        System.out.println("max -  " + max);
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min) min = array[i];
        }
        System.out.println("min - " +min);
    }
}



