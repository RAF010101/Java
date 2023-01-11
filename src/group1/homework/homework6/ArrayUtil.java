package group1.homework.homework6;

public class ArrayUtil {
    void maxOfArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
    void minOfArray(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min ){
                min = array[i];
            }
        }
        System.out.println(min);
    }


    void maxSortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;


            }
               System.out.print(array[i] + ",");

        }

    }
    void minSortArray(int[] array){
        System.out.println();
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]){
                int temp = array[i];
                array[i] =  array[i + 1];
                array[i + 1] = temp;
            }
            System.out.print(array[i] + ",");
        }
    }
}





