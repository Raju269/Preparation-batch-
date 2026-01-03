package TwoDeminisionArray;

import java.util.Scanner;

public class User_input2DArray {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the value of n is :");
        int n = src.nextInt();
        System.out.print("Enter the value of m is :");
        int m = src.nextInt();
        int[][] arr = new int[m][n];
        int r  = arr.length;
        int c  = arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = src.nextInt();
            }
        }
        System.out.println("The value of 2D Array is :");
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
