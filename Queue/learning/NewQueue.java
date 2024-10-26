import java.util.*;
// creating queue 
public class NewQueue {
    // creating two variables rear and front where rare is always initialized with -1 
    int rear = -1;
    int front = 0;
    static{
        // asking for the length of array
        System.out.print("Enter length of Queue:- ");
    }
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //  array will gonna run till that length
    int arr[] = new int[n];

    void Insert( int value){
        if( rear < n - 1 ){
            //inserting element int the queue 
            // increasing rare from -1 to 0
            rear++;
            // using rare as index for array and giving value in it 
            arr[rear] = value;
            System.out.print(arr[rear] + "\t"); 
        }
        else{
            System.out.println("\nQueue is full cannot add more element to it");
        }
    }
    // we will create a remove function
    int remove(){
        if( front > rear ){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("\nAfter:- ");
            // the loop runs from front  = 0 to rear = n 
            for (int i = front; i < rear; i++) {
                //now shifting value of 1st index at 0th index
                arr[i] = arr[i+1];
                System.out.print(arr[i] + "\t");
            }
        }
        // after shifting the last index will gonna be empty so dcrementing the rear from n-1 to n-2
        rear--;
        return front;
    }
    
    public static void main(String[] args) {
        NewQueue obj = new NewQueue();
        obj.Insert(10);
        obj.Insert(20);
        obj.Insert(30);
        obj.Insert(40);
        obj.remove();
    }
    
}
