package OneDeminsionArray;

import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the value n ");
        int n = src.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = src.nextInt();
        }
        // Maximum element
//         1 method one
//        int max = arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]>max){
//                max = arr[i];
//
//            }
//
//        }
//         System.out.println(max);
//        2 method two
//        int max1 = arr[0];
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max1){
//                max1 = arr[i];
//            }
//        }
//        System.out.println(max1);
//        3rd method
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);
    }

}
