package OneDeminsionArray;

import java.util.Scanner;

public class CaluculateProduct {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the value of n is : ");
        int n = src.nextInt();
        int[] arr = new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i] = src.nextInt();
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
       int product = 1;
        for (int j : arr) {
            product = product * j;
        }
        System.out.println();
        System.out.println(product);
    }
}
