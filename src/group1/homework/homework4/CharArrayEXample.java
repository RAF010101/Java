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
        System.out.println(ch2[ch2.length / 2]);
        System.out.println(ch2[((ch2.length / 2) + 1)]);



        char[] ch3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        boolean b1 = false;
        if (ch3[ch3.length - 2] == 'l' && ch3[ch3.length - 1] == 'y') {
            b1 = true;
        }
        System.out.println(b1);
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (char i : text) {
            if (i != ' ')
                System.out.print(i);

        }
    }
}







