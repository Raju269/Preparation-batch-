package OneDeminsionArray;

import java.util.Scanner;

public class inputandoutput {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int[] arr = {10,20,30,40,50};
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Enter the value of n is : ");
        int n = src.nextInt();
        int[] brr = new int[n];
        for(int i=0;i<brr.length;i++){
            brr[i] = src.nextInt();
        }
        for(int j : brr){
            System.out.print(j+" ");
        }
    }
}
