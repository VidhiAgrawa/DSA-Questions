import java.util.*;
public class NewQueue {
    int rear = -1;
    int front = 0;
    static{
        System.out.print("Enter length of Queue:- ");
    }
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];

    void Insert( int value){

        rear++;
        arr[rear] = value;
        System.out.print(arr[rear] + "\t");

        
    }
    int remove(){
        System.out.println("After:- ");
        front++;
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i+1];
            System.out.print(arr[i] + "\t");
        }
        rear--;
        return front;
    }
    
    public static void main(String[] args) {
        NewQueue obj = new NewQueue();
        obj.Insert(10);
        obj.Insert(20);
        obj.Insert(30);
        obj.remove();
    }
    
}
