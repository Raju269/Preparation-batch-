package OneDeminsionArray;

import java.util.Scanner;

public class EmptyArrayCreation {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Enter the value of n is : ");
        int n = src.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = src.nextInt();
        }
        for(int i : arr1){
            System.out.print(i+" ");
        }
    }

}
