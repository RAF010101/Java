package group1.homework.homework7;

public class Calculator {
   double plus (double a , double b){
       return a + b;
   }
   double minus (double a , double b){
       return a - b;
   }
   double divide (double a ,  double b){
        if (b == 0 ) System.out.println("0 ի չի բաժանվում,");
       return a / b;
   }
   double multiply (double a, double b){
       return a * b;
   }

}
