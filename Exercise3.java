import java.util.Scanner;
class Exercise3 {
    int max = 100;
    char[] stack = new char[max];
    int top = -1;

    void push(char c) {
        stack[++top] = c;
    }

    char pop() {
        return stack[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }

    static boolean isBalanced(String str) {
        Exercise3 s = new Exercise3();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                s.push(ch);
            }
            else if (ch == ')') {
                if (s.isEmpty()) {
                    return false;
                }
                s.pop();
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an expression with parentheses: ");
        String exp = sc.nextLine();

        if (isBalanced(exp)) {
            System.out.println("The expression has balanced parentheses.");
        } else {
            System.out.println("The expression has imbalanced parentheses.");
        }
    }
}