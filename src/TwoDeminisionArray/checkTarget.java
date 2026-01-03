package TwoDeminisionArray;

import java.util.Scanner;

public class checkTarget {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter n ");
        int n = src.nextInt();
        System.out.print("Enter m ");
        int m = src.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = src.nextInt();
            }
        }
        System.out.println("Enter target value");
        int target = src.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==target){
                    System.out.print("Target is found");
                }
            }
        }
    }
}
