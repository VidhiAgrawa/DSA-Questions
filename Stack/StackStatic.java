// Write a menu driven program to implement the push, pop and display option of the stack

class StackArray {
    int[] stack;
    int top, size;

    StackArray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        stack[++top] = value;
        System.out.println(value + " pushed onto the stack.");
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return;
        }
        System.out.println(stack[top--] + " popped from the stack.");
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}

public class StackStatic {
    public static void main(String[] args) {

        StackArray stack = new StackArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.pop();
        stack.display();

    }
}
