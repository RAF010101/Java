package group1.homework.homework6;

public class CharExample {

    void trim (char[] array) {
        int starindex = 0;
        int endindex = array.length;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == ' ') {
                starindex++;
            }else break;
        }
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] == ' ') {
                endindex--;
            }else break;
        }
            char[] result = new char[endindex - starindex];
            int j = 0;
        for (int i = starindex; i <endindex ; i++) {
                result[j++] = array[i];
        }
        for (char i :result) {
            System.out.print(i);

        }
        }

    }











