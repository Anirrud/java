import java.util.*;

public class spiral_box {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Array A Size: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int start_row = 0, end_row = n - 1;
        int start_col = 0, end_col = n - 1;
        int count = 1;

        while (start_row <= end_row && start_col <= end_col) {
            // Fill top row
            for (int i = start_col; i <= end_col; i++) {
                arr[start_row][i] = count++;
            }
            start_row++;

            // Fill right column
            for (int i = start_row; i <= end_row; i++) {
                arr[i][end_col] = count++;
            }
            end_col--;

            // Fill bottom row
            if (start_row <= end_row) {
                for (int i = end_col; i >= start_col; i--) {
                    arr[end_row][i] = count++;
                }
                end_row--;
            }

            // Fill left column
            if (start_col <= end_col) {
                for (int i = end_row; i >= start_row; i--) {
                    arr[i][start_col] = count++;
                }
                start_col++;
            }
        }

        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
