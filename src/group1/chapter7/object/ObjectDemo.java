package group1.chapter7.object;

public class ObjectDemo {
    public static void main(String[] args) {
        Object ob1 = new Object(90,21);
        Object ob2 = new Object(90,21);
        Object ob3 = new Object(82,213);
        System.out.println("ob1 == ob2 " + ob1.equalTo(ob2));
        System.out.println("ob2 == ob3" +ob2.equalTo(ob3));

    }
}
