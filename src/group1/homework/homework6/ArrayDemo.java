package group1.homework.homework6;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayUtil au = new ArrayUtil();
        int[] a = {23, 45, 40, 67, 8198, 1234, 4547, 8193,12,28,1621};
        au.maxArray(a);
        au.minArray(a);
        au.maxSortArray(a);
        System.out.println();
        au.maxSortArray2(a);
        System.out.println();
        au.minArraySort(a);
        System.out.println();
        au.minArraySort2(a);
    }
}
