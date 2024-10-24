import java.util.Scanner;

public class Creation {
    static void create(int queue[]){
        int front , rare;
        front = rare = 0;
        for (int i = 0; i < queue.length; i++) {
            System.out.println("Enter the element in Queue " + i + " :- ");
            Scanner sc = new Scanner(System.in);
            int element = sc.nextInt();
            queue[i] = element;
            rare++;
        }
        System.out.println("Before Deletion:- ");
        for (int i = front; i < rare; i++) {
            System.out.print(queue[i] + "\t");
            
        }
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
