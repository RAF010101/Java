package group1.chapter5;

public class ForEach {
    public static void main(String[] args) {
       /* int num [] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        int o = num.length - 1;
        int x = 0 ;
        for (int i = 0; i < num.length ; i++) {
            System.out.println("Знaчeниe равно:" + num[i] + " ");
            x = x + num[i];
        }
        System.out.println("Cyммa равна: "+x);*/
            int num [] = {1,2,3,4,5,6,7,8,9,10};
            int sum = 0;
        for (int x : num) {
            System.out.println("Знaчeниe равно:"+x);
            sum +=x;
        }
        System.out.println("Cyммa равна:" + sum);

    }
}
