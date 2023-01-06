package group1.homework.homework4;

public class CharArrayEXample {
    public static void main(String[] args) {
        char ch1[] = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char ch = 'o';
        int checking = 0;
        for (int x : ch1) {
            if (x == ch) checking++;
        }
        System.out.println("Me have another " + checking + " " + ch);
        char[] ch2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        int p = (ch2.length - 1) / 2;
        int c = p + 1;
        System.out.println(ch2[p]);
        System.out.println(ch2[c]);
        char[] ch3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        boolean op = false;
        if (ch3[6] == 'l' && ch3[7] == 'y') {
            op = true;
        }
        System.out.println(op);
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};


    }
}







