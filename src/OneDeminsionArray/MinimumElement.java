package OneDeminsionArray;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int[]arr = new int[n];
        for (int i = 0 ; i<arr.length; i++) {
            arr[i] = src.nextInt();
        }
        // 1 methods
//        int min = arr[0];
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }
//        System.out.println("The minimum value is "+min);
        // 2nd method
//        int min = arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }
//        System.out.println("Minimum value"+min);
        // 3rd method
        int min = Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("it is minimum value is : "+ min);
    }

}
