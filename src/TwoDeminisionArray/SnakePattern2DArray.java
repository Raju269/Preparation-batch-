package TwoDeminisionArray;

import java.util.Scanner;

public class SnakePattern2DArray {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the value of n is : ");
        int n = src.nextInt();
        System.out.print("Enter the value of m is : ");
        int m = src.nextInt();
        int[][] arr = new int[n][m];
        int r = arr.length;
        int c = arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = src.nextInt();
            }
        }
        System.out.println();

        for(int i=0;i<r;i++){
            if(i%2==0){
                for(int j=0;j<c;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else if (i % 2 != 0) {
                for (int j=c-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
