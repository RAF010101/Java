package group1.chapter7.overload1;

public class Overload {
    void Test(){
        System.out.println("Пapaмeтpы отсутствуют");
    }
    void Test(int a ,int b){
        System.out.println("a & b "+  a + " " + b);
    }
    void Test (double a){
        System.out.println("a " + a );
    }


}
