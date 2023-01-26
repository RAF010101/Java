package group1.chapter7.test6;

public class TestDemo {
    int a ;
    TestDemo (int i){
        a = i;
    }
    TestDemo incrbyten (){
        TestDemo  temp = new TestDemo(a + 10);
        return temp;
    }
}
