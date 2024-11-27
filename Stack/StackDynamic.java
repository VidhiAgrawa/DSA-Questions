// Write a menu driven program to implement the push, pop and display option of the stack
// with the help of dynamic memory allocation (linked list)

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class StackLinkedList {
    Node top;

    StackLinkedList() {
        top = null;
    }

    void push(int value) {
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println(value + " pushed onto the stack.");
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow!");
            return;
        }
        System.out.println(top.data + " popped from the stack.");
        top = top.next;
    }

    void display() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Stack elements:");
        Node current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

public class StackDynamic {
    public static void main(String[] args) {
        StackLinkedList stackList = new StackLinkedList();
        stackList.push(10);
        stackList.push(20);
        stackList.push(30);
        stackList.display();
        stackList.pop();
        stackList.display();
    }
}