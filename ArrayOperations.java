import java.util.*;

public class ArrayOperations {

    // Method to sort array and find second highest & second lowest
    public static void processArray(int[] arr) {

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        // Logic to find second lowest and second highest numbers
        int secondLowest = arr[1];
        int secondHighest = arr[arr.length - 2];

        System.out.println("\nSecond Lowest Number: " + secondLowest);
        System.out.println("Second Highest Number: " + secondHighest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 different numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        processArray(numbers);

        sc.close();
    }
}
