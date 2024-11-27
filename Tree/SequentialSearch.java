import java.util.Scanner;

public class SequentialSearch {

    // Sequential search function
    public static int sequentialSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return index if element is found
            }
        }
        return -1; // Return -1 if element is not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);;

        // Input array elements
        System.out.println("Elements of the array:");
        int[] array = { 2, 4, 87, 3, 9, 43, 536, 8,21  };
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        // Input the element to search
        System.out.print("\nEnter the element to search for: ");
        int target = scanner.nextInt();

        // Perform sequential search
        int result = sequentialSearch(array, target);

        // Output the result
        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result + ".");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

    }
}

