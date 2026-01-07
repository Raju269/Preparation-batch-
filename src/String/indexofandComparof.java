package String;

import java.util.Scanner;

public class indexofandComparof {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the value of n is : ");
        String s = src.nextLine();
        System.out.println();
        String b = "Raju";
        System.out.println(s.length());
        System.out.println(b.indexOf('j'));
        System.out.println(s.compareTo(b));
    }
}
