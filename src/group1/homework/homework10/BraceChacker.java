package group1.homework.homework10;

public class BraceChacker {
    String text;
    public char c;
    public char lastSimvol;

    BraceChacker(String text) {
        this.text = text;
    }

    Stack stack = new Stack();

    void check() {

        for (int i = 0; i < text.length(); i++) {
            c = text.charAt(i);
        }
        switch (c) {
            case '[':
                break;
            case '(':
                break;
            case '{':
                stack.push(c);
                break;
            case ']':
                lastSimvol = stack.pop();
                if (lastSimvol != '[') {
                    System.err.println("Error");
                }
                break;
            case ')':
                lastSimvol = stack.pop();
                if (lastSimvol != '(') {
                    System.out.println("Error");
                    break;
                }
            case '}':
                lastSimvol = stack.pop();
                if (lastSimvol != '{'){
                    System.out.println("Error");
                }break;

        }

    }
}
