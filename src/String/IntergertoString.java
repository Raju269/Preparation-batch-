package String;

import java.util.Scanner;

public class IntergertoString {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int x = src.nextInt();
        String s = Integer.toString(x);
        s += 10;
        System.out.println(s);
        System.out.println(x);
    }
}
