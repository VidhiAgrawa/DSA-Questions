// Write a program to implement two stacks in a single array
class TwoStacks {
    int[] array;
    int top1, top2, size;

    TwoStacks(int size) {
        this.size = size;
        array = new int[size];
        top1 = -1;
        top2 = size;
    }

    void push1(int value) {
        if (top1 + 1 == top2) {
            System.out.println("Stack Overflow for Stack 1!");
            return;
        }
        array[++top1] = value;
        System.out.println(value + " pushed into Stack 1.");
    }

    void push2(int value) {
        if (top1 + 1 == top2) {
            System.out.println("Stack Overflow for Stack 2!");
            return;
        }
        array[--top2] = value;
        System.out.println(value + " pushed into Stack 2.");
    }

    void pop1() {
        if (top1 == -1) {
            System.out.println("Stack Underflow for Stack 1!");
            return;
        }
        System.out.println(array[top1--] + " popped from Stack 1.");
    }

    void pop2() {
        if (top2 == size) {
            System.out.println("Stack Underflow for Stack 2!");
            return;
        }
        System.out.println(array[top2++] + " popped from Stack 2.");
    }

    void display1() {
        if (top1 == -1) {
            System.out.println("Stack 1 is empty!");
            return;
        }
        System.out.println("Stack 1 elements:");
        for (int i = top1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    void display2() {
        if (top2 == size) {
            System.out.println("Stack 2 is empty!");
            return;
        }
        System.out.println("Stack 2 elements:");
        for (int i = top2; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}

public class TwoStacksInArray {
    public static void main(String[] args) {
        TwoStacks stacks = new TwoStacks(5);
        stacks.push1(10);
        stacks.push1(20);
        stacks.push1(30);
        stacks.display1();
        stacks.push2(40);
        stacks.push2(50);
        stacks.push2(60);
        stacks.display2();
        stacks.pop1();
        stacks.display1();
        stacks.pop2();
        stacks.display2();
    }
}