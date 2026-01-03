package TwoDeminisionArray;

import java.util.Scanner;

public class Rotatingquestion {
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
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("Reverse array ");
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Rotate try ");
        System.out.println();

        for(int col = 0; col<arr[0].length;col++){
            int i=0;
            int j=arr.length-1;
            while(i<j){
                int temp = arr[i][col];
                arr[i][col] = arr[j][col];
                arr[j][col] = temp;
                i++;
                j--;
            }
        }
        System.out.println();
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
