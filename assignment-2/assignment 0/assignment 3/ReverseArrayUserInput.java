import java.util.Scanner;

public class ReverseArrayUserInput {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Step 2: Create the array
        int[] array = new int[size];

        // Step 3: Take input for each element
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Step 4: Reverse the array in place
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

        // Step 5: Print the reversed array
        System.out.println("Reversed Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Close the scanner
        scanner.close();
    }
}