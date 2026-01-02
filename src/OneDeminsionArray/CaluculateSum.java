package OneDeminsionArray;

import java.util.Scanner;

public class CaluculateSum {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the value of n is : ");
        int n = src.nextInt();
        int[] arr = new int[n];
//        int sum = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = src.nextInt();
        }
        int sum =0;
        for (int j : arr) {
            sum = sum + j;
        }
        for (int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("The sum of all element is : "+sum);

    }
}
