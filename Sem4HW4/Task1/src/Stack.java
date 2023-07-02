public class Stack {
    private int[] stack;
    private int top;

    public Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean empty() {
        return (top == -1);
    }

    public void push(int value) {
        if (top < stack.length - 1) {
            stack[++top] = value;
        } else {
            System.out.println("Стэк заполнен, не удается добавить элемент: " + value);
        }
    }

    public int peek() {
        if (!empty()) {
            return stack[top];
        } else {
            System.out.println("Стэк пуст");
            return -1;
        }
    }

    public int pop() {
        if (!empty()) {
            return stack[top--];
        } else {
            System.out.println("Стэк пуст.");
            return -1;
        }
    }
}