package OneDeminsionArray;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int[] arr = {10,20,30,40,50};
        int target = src.nextInt();
        for (int j : arr) {
            if (j == target) {
                System.out.println("Target is found ");
                return;
            }
            else{
                System.out.println("Target is not found ");
                return;
            }
        }
    }
}
