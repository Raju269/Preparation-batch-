package OneDeminsionArray;

import java.util.Scanner;

public class PrintnegativeElement {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = src.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=src.nextInt();
        }
        for (int j : arr) {
            if (j < 0) {
                System.out.println("This is -ve element"+j);
                return;
            }
        }

    }
}
