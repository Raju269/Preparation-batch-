package OneDeminsionArray;

import java.util.Scanner;

public class BasicSwap {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int m = src.nextInt();
        System.out.println("The value of n is : "+n);
        System.out.println("The value of m is : "+m);
        // swap;
        int temp;
        temp = n;
        n = m;
        m = temp;
        System.out.println("The value of n is : "+n);
        System.out.println("The value of m is : "+m);
    }
}
