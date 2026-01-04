package TwoDeminisionArray;

import java.util.Scanner;

public class SpirallyTraveringMatrix {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        // Input matrix
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Spiral traversal
        int top = 0;
        int bottom = r - 1;
        int left = 0;
        int right = c - 1;

        System.out.println("\nSpiral Traversal:");

        while (top <= bottom && left <= right) {

            // 1️⃣ Left to Right (top row)
            for (int j = left; j <= right; j++) {
                System.out.print(matrix[top][j] + " ");
            }
            top++;

            // 2️⃣ Top to Bottom (right column)
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // 3️⃣ Right to Left (bottom row)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(matrix[bottom][j] + " ");
                }
                bottom--;
            }

            // 4️⃣ Bottom to Top (left column)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }

        sc.close();
    }
}
