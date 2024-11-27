// Write a menu driven program to implement the various operations on a linear queue with
// the help of dynamic memory allocation
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class QueueLinkedList {
    Node front, rear;

    QueueLinkedList() {
        front = rear = null;
    }

    void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(value + " enqueued into the queue.");
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow!");
            return;
        }
        System.out.println(front.data + " dequeued from the queue.");
        front = front.next;
        if (front == null) rear = null; // Reset rear if queue becomes empty
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Queue elements:");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class LinearQueueDynamic {
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(69);
        queue.display();
        queue.dequeue();
        queue.display();
    }
}