package TwoDeminisionArray;

import java.util.Scanner;

public class SearchRowColumMatrix {
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
        System.out.println("Enter target value ");
        int checkTarget = src.nextInt();
        int r = arr.length;
        int c = arr[0].length;
        int i = 0;
        int j = c-1;
         boolean found = false;
//      search
        while(i<r && j>=0){
            if(arr[i][j]>checkTarget){
                j--; // go left of the array
            } else if (arr[i][j] < checkTarget) {
                i++ ;// go down of the array
            }
            else {
                System.out.println("Target found at index (" + i + ", " + j + ")");
                found = true;
                break;            }
        }
        if (!found) {
            System.out.println("Target not found");
        }
    }
}
