import java.util.*;

public class NonZeroArray {

    public static void main(String[] args) {

        // Prompt the user to enter the size of the array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Prompt the user to enter the elements of the array
        int[][] originalArray = new int[rows][columns];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                originalArray[i][j] = scanner.nextInt();
            }
        }

        // Create a new array containing only the rows with non-zero elements
        int[][] nonZeroArray = new int[rows][columns];
        int nonZeroRowCount = 0;
        for (int i = 0; i < rows; i++) {
            boolean hasNonZero = false;
            for (int j = 0; j < columns; j++) {
                if (originalArray[i][j] != 0) {
                    hasNonZero = true;
                    break;
                }
            }
            if (hasNonZero) {
                for (int j = 0; j < columns; j++) {
                    nonZeroArray[nonZeroRowCount][j] = originalArray[i][j];
                }
                nonZeroRowCount++;
            }
        }
        // Print the new array
        System.out.println("The new array containing only rows with non-zero elements:");
        for (int i = 0; i < nonZeroRowCount; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(nonZeroArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
