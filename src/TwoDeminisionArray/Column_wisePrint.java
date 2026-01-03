package TwoDeminisionArray;

import java.util.Scanner;

public class Column_wisePrint {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the value of  n ");
        int n = src.nextInt();
        System.out.print("Enter the value of m ");
        int m = src.nextInt();
        int[][] arr = new int[n][m];
        int r = arr.length;
        int c = arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = src.nextInt();
            }
        }
        System.out.println("column wise print");
        for(int j=0;j<r;j++){
            for(int i =0;i<c;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
