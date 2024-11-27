// Write a menu driven program to implement the various operations on a linear queue with
// the help of static memory allocation

class LinearQueue {
    int[] queue;
    int front, rear, size;

    LinearQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = rear = -1;
    }

    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow!");
            return;
        }
        if (front == -1) front = 0; // Initialize front on first enqueue
        queue[++rear] = value;
        System.out.println(value + " enqueued into the queue.");
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow!");
            return;
        }
        System.out.println(queue[front++] + " dequeued from the queue.");
        if (front > rear) front = rear = -1; // Reset queue when empty
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Queue elements:");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

public class LinearQueueStatic {
    public static void main(String[] args) {
        LinearQueue queue = new LinearQueue(3);
        queue.enqueue(89);
        queue.enqueue(9);
        queue.enqueue(8);
        queue.display();
        queue.dequeue();
        queue.display();
    }
}