package group1.chapter5;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first:{
            second:{
                third:{
                    System.out.println(
                            "Предшествует оператру break");
                    if (t) break second;
                    System.out.println(
                            "тот оператор не будет выполняться");
                }
                System.out.println(
                        "тот оператор не будет выполняться");
            }
            System.out.println("Этот оператор следует за блоком second");
        }
    }
}
