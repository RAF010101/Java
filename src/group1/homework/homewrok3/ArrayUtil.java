package group1.homework.homewrok3;

public class ArrayUtil {
    public static void main(String[] args) {
        int array[] = {7, 18, 36, 52, 74, 89, 91, 24, 31, 48};
        System.out.println("This is a first element " + array[0]);
        int a = array.length - 1;
        System.out.println("This is a last element " + array[a]);
        a = a / 2;
        System.out.println("This is a average elemnt " + array[a]);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 < 1) System.out.print(array[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 > 0) System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Elements + reuslt");
        int reusult = 0;
        for (int i = 0; i < array.length; i++) {
            reusult = reusult + array[i];
            System.out.print(" "+ reusult );

        }
        System.out.println();
        reusult = reusult / 9;
        System.out.println(reusult);


    }

}


