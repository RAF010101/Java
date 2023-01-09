package group1.homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' ', ' '};
        for (int i = 0; i < spaceArray.length; i++) {

            if (spaceArray[0] != ' ') System.out.println(spaceArray[i]);

        }
    }
}
