package OneDeminsionArray;

import java.util.Scanner;

public class Target_element {
    public static void main(String[] args) {
    Scanner src = new Scanner(System.in);
        System.out.println("Enter the value of n is: ");
    int n = src.nextInt();
    int[] arr = new int[n];
     boolean flag = false;
    for(int i=0;i<arr.length;i++){
        arr[i] = src.nextInt();
    }
        System.out.println("Enter the target value is ");
    int targetElement = src.nextInt();

    for(int i=0;i<arr.length;i++){
        if(arr[i] == targetElement){
            System.out.println("found target ");
            flag = true;
            return;
        }
    }
    if(flag == false){
        System.out.println("Target is not found ");
    }
    }
}
