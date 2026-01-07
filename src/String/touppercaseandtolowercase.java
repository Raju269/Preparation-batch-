package String;

import java.util.Scanner;

public class touppercaseandtolowercase {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the value ");
        String s = src.nextLine();
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        // Concat
        System.out.print("Enter the value ");
        String b = src.nextLine();
        System.out.println(s+b);

    }
}
