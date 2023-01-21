package group1.chapter7.callByVallue2;

public class CallByVallue {
    public static void main(String[] args) {
        Test ob = new Test(90,70);
        System.out.println(ob.a+ " " +  ob.b);
        ob.meth(ob);
        System.out.println(ob.a + " " + ob.b);

    }
}
