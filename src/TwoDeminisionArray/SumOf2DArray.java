package TwoDeminisionArray;

import java.util.Scanner;

public class SumOf2DArray {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the value of n is :");
        int n = src.nextInt();
        System.out.print("Enter the value of m is :");
        int m = src.nextInt();
        int[][] arr = new int[n][m];
        int r = arr.length;
        int c = arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = src.nextInt();
            }
        }
        // sum
        int sum = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum = sum + arr[i][j];
            }
        }
        System.out.println("The sum is "+sum);
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
             System.out.println();
        }

    }
}
