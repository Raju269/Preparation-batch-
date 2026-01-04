package TwoDeminisionArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pascal_Triangle {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int numRows = sc.nextInt();

        List<List<Integer>> triangle = new ArrayList<>();

        // Generate Pascal Triangle
        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int val = triangle.get(i - 1).get(j - 1)
                            + triangle.get(i - 1).get(j);
                    row.add(val);
                }
            }

            triangle.add(row);
        }

        // Print Pascal Triangle
        System.out.println("\nPascal Triangle:");
        for (List<Integer> row : triangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
