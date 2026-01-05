package Basic;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter n is : ");
        int n = src.nextInt();
        System.out.print("Enter m is : ");
        int  m = src.nextInt();
        int add = n+m ;
        System.out.println("The sum of two number is : "+add);
    }
}
