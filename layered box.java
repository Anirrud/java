import java.util.*;

public class layered_box {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Array A Size: ");
        int n = sc.nextInt();
        int size = n * 2 - 1;
        int[][] arr = new int[size][size];

        int num = n;
        int start_row = 0, end_row = size - 1;
        int start_col = 0, end_col = size - 1;

        while (start_row <= end_row && start_col <= end_col) {
            // Fill top row
            for (int i = start_col; i <= end_col; i++) {
                arr[start_row][i] = num;
            }
            // Fill right column
            for (int i = start_row + 1; i <= end_row; i++) {
                arr[i][end_col] = num;
            }
            // Fill bottom row
            for (int i = end_col - 1; i >= start_col; i--) {
                arr[end_row][i] = num;
            }
            // Fill left column
            for (int i = end_row - 1; i > start_row; i--) {
                arr[i][start_col] = num;
            }

            // Move to the next layer
            start_row++;
            end_row--;
            start_col++;
            end_col--;
            num--;
        }

        // Print the matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
