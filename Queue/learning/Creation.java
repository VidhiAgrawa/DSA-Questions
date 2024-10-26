import java.util.Scanner;

public class Creation {
    // for creating queue 
    static void create(int queue[]){
        // there will be front and rare always
        int front , rare;
        // inisialized from 0
        front = rare = 0;
        // loop for asking element in queue from user
        for (int i = 0; i < queue.length; i++) {
            System.out.println("Enter the element in Queue " + i + " :- ");
            Scanner sc = new Scanner(System.in);
            int element = sc.nextInt();
            // giving the value from user to array of queue
            queue[i] = element;
            // and increasing value of rare
            rare++;
        }
        // only printing
        System.out.println("Before Deletion:- ");
        for (int i = front; i < rare; i++) {
            System.out.print(queue[i] + "\t");
            
        }
        // increaing front to delete the first element
        front++;
        System.out.println("\nAfter Deletion:- ");
        for (int i = front; i < rare; i++) {
            System.out.print(queue[i] + "\t");
        }

    }
    
    public static void main(String[] args) {
        int queue[] = new int[5];
        create(queue);
    }
}
