package group1.chapter7.overload;

public class OverloadDemo {
    void Test(){
        System.out.println("Пapaмeтpы отсутствуют");
    }
    void Test(int a ){
        System.out.println("a = " + a);
    }
    void Test (int a, int b){
        System.out.println("a = " + a + " " + b);
    }
    double Test (double a){
        return a * a;
    }




}
