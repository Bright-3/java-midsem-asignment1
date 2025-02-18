public class FindLargestElement {
    public static void main(String[] args) {
        // Step 1: Define the array
        int[] numbers = {3, 5, 7, 2, 8};

        // Step 2: Assume the first element is the largest
        int largest = numbers[0];

        // Step 3: Iterate through the array
        for (int i = 1; i < numbers.length; i++) {
            // Step 4: Compare the current element with the largest
            if (numbers[i] > largest) {
                // Step 5: Update the largest element
                largest = numbers[i];
            }
        }

        // Step 6: Print the largest element
        System.out.println("The largest element in the array is: " + largest);
    }
}