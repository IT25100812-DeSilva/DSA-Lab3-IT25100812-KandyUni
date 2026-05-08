import java.util.Scanner;
public class Exercise2 {
    int max = 100;
    char[] stack = new char[max];
    int top = -1;

    public void push(char c) {
        stack[++top] = c;
    }

    public char pop() {
        return stack[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Exercise2 s = new Exercise2();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        System.out.print("Reversed string: ");

        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }
}