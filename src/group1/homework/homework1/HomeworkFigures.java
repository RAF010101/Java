package group1.homework.homework1;

public class HomeworkFigures {
    public static void main(String[] args) {
        System.out.println("Start Figure 1");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println("Figure 1 Finish *_*");
        System.out.println();
        System.out.println("Start Figure 2");
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");

            }
            for (int k = 0; k <= i; k++) {

                System.out.print("* ");


            }
            System.out.println();
        }
        System.out.println("Finish Figure 2 *_*");
        System.out.println();
        System.out.println("Start Figure 3");
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println("Figure 3 Finish *_*");
        System.out.println();

    }

}








