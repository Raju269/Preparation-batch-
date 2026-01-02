package OneDeminsionArray;

import java.util.Scanner;

public class PrintSecondMaximum {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the value of n is : ");
        int n = src.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = src.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int smax = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];

            }

        }
        System.out.println( "Second maximum element is : "+ smax);
    }
}
