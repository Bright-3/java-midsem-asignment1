public class SumOf2DArray {
    public static void main(String[] args) {
        // Define a 2D array
        int[][] array2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Initialize a variable to store the sum
        int totalSum = 0;

        // Loop through each row of the 2D array
        for (int i = 0; i < array2D.length; i++) {
            // Loop through each element in the row
            for (int j = 0; j < array2D[i].length; j++) {
                // Add the element to the total sum
                totalSum += array2D[i][j];
            }
        }

        // Print the total sum
        System.out.println("The sum of all elements in the 2D array is: " + totalSum);
    }
}