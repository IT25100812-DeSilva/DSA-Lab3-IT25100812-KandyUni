public class StackArray {
    int max = 10;
    int[] stack = new int[max];
    int top = -1;

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = item;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == max - 1;
    }

    public void display() {
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        StackArray st = new StackArray();

        st.push(10);
        st.push(20);
        st.push(30);

        st.display();

        System.out.println("Peek: " + st.peek());

        System.out.println("Popped: " + st.pop());

        st.display();

        System.out.println("Is stack empty? " + st.isEmpty());
        System.out.println("Is stack full? " + st.isFull());
    }
}