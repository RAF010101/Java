package group1.chapter7.callByVallue2;

public class Test {
    int a , b;
    Test(int i, int j){
        a = i;
        b = j;
    }
    void meth (Test o) {
        o.a *= 2;
        o.b /= 2;

    }
}
