package String;

import java.util.Scanner;
//contains():
//
//Checks if a substring exists anywhere in the string.
//
//startsWith():
//
//Checks if a string begins with a given prefix.

public class ContainsandStartswith {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String s = "Raju";
        System.out.println(s);
        System.out.println(s.contains("Raju") );
         System.out.println(s.contains("Kumar") );
         System.out.println(s.startsWith("Ra") );
         System.out.println(s.startsWith("ju") );

    }
}
