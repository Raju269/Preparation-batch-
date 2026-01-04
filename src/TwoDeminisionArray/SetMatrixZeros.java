package TwoDeminisionArray;

import java.util.Scanner;

public class SetMatrixZeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value r is : ");
        int r = sc.nextInt();
        System.out.print("Enter the value c is : ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean[] row = new boolean[r];
        boolean[] col = new boolean[c];

        // Step 1: mark rows and columns
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Step 2: set zeroes
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Print result
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
