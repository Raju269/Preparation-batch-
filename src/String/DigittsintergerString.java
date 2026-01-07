package String;

import java.util.Scanner;

public class DigittsintergerString {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the no of digit ");
        int x = src.nextInt();
        String s = Integer.toString(x);
        System.out.print("Total no of digit is : ");
        System.out.println(s.length());
    }
}
