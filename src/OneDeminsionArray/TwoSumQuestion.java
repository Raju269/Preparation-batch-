package OneDeminsionArray;

import java.util.Scanner;

public class TwoSumQuestion {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the value n ");
        int n = src.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = src.nextInt();
        }
        // Two sum
        int target = src.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Target is found ");
                }
            }
        }

    }
}
