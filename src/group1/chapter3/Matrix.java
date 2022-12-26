package group1.chapter3;

public class Matrix {
    public static void main(String[] args) {
        double m[][] = {
                {0 * 0, 1 * 0, 2 * 0, 3 * 0},
                {0 * 1, 1 * 1, 2 * 1, 3 * 1},
                {0 * 2, 1 * 2, 2 * 2, 3 * 3},
                {0 * 3, 1 * 3, 2 * 3, 3 * 3}
        };
        int i, k;
        for (i = 0; i < 4; i++) {
            for (k = 0; k < 4; k++)
                System.out.print(m[i][k] + " ");
                System.out.println();


        }
    }
}
