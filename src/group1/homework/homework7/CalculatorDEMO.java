package group1.homework.homework7;

public class CalculatorDEMO {
    public static void main(String[] args) {
       Calculator mycalculiator  = new Calculator();
       double a1 = mycalculiator.plus(190, 12093);
        System.out.println(a1);
        double a2 = mycalculiator.minus(180,90);
        System.out.println(a2);
        double a3 = mycalculiator.divide(19,6);
        System.out.println(a3);
        double a4 = mycalculiator.multiply(5,6);
        System.out.println(a4);
    }
}
