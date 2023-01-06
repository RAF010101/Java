package group1.chapter5;

public class Menu {
    public static void main(String[] args)
            throws java.io.IOException {
        char choies;
        do {
            System.out.println("Cпpaвкa по оператору:");
            System.out.println("     1.if");
            System.out.println("     2.switch");
            System.out.println("     3.while");
            System.out.println("     4.do-while");
            System.out.println("     5.for");
            System.out.println("     Bыбepитe нужный пункт:");
            choies = (char) System.in.read();
        } while (choies < '1' || choies > '5');
        System.out.println("\n");
        switch (choies) {
            case 1:
                System.out.println("if: ");
                System.out.println("f(ycлoвиe) оператор;");
                System.out.println("else оператор;");
                break;
            case 2:
                System.out.println("switch:");
                System.out.println("switсh(выражение) {");
                System.out.println("case константа:");
                System.out.println(
                        "последовательность операторов");
                System.out.println("break;");
                System.out.println("/ / ... ");
                System.out.println("}");
                break;
            case 3:
                System.out.println("while:");
                System.out.println("while(ycлoвиe) break;оператор;");
                break;
            case 4:
                System.out.println("do-while:");
                System.out.println("do {");
                System.out.println(" оператор;");
                System.out.println("} while (условие);");
                break;
            case 5:
                System.out.println("for:");
                System.out.println("for(инициaлизaция; условие; итерация)");
                System.out.println("оператор;");
                break;
        }
    }
}
