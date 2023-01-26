package group1.chapter7.test3;

public class TestDemo {
    int a , b;
    TestDemo (int i  , int j){
        this.a = i;
        this.b = j;
    }
    boolean equalTo (TestDemo o) {
        if (o.a == a && o.b == b){
            return true;
        }else return false;
    }

}
