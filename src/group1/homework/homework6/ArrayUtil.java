package group1.homework.homework6;

public class ArrayUtil {
    void maxArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    void minArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    void maxSortArray(int[] array) {

        int a;
        do {
            a = 0;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    a++;
                }


            }
        } while (a > 0);
        for (int i : array) {
            System.out.print(i + " ");

        }
    }

    void maxSortArray2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }

            }

        }
        for (int i : array) {
            System.out.print(i + " ");

        }
    }

    void minArraySort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }

            }

        }
        for (int i : array) {
            System.out.print(i + " ");

        }
    }

    void minArraySort2(int[] array) {
        int a;
        do {
            a = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }

            }
        } while (a > 0);
        for (int i : array) {
            System.out.print(i + " ");

        }

    }


}









