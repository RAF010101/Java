package group1.chapter7.object;

public class Object {
    int a;
    int b;

    Object (int i, int j) {
        a = i;
        b = j;
    }

    Boolean equalTo(Object o) {
        if (o.a == a && o.b == b){
            return true;
        }else {
            return false;
        }
    }
}
