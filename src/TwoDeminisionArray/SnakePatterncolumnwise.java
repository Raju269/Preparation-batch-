package TwoDeminisionArray;

import java.util.Scanner;

public class SnakePatterncolumnwise {
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
        System.out.println("Column wise snake pattern printing ");
        for(int j=0;j<c;j++){
            if(j%2==0){
                for(int i=0;i<r;i++){
                    System.out.print(arr[i][j]+" ");
                }
            } else if (j%2!=0)  {
                for(int i=r-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
