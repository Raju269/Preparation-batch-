package String;

import java.util.Scanner;

public class CharAtandlength {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
//        System.out.print("Enter the your name ");
//        String s = src.next(); // it not take all value after then space
//        System.out.println();
//        System.out.println("You name is "+s);
//        System.out.println();
//        System.out.print("Hello,Raju This side Neha aggrawal HR \n ok Raju Tell me about yourself? ");
//        System.out.println();
//        String tellMe = src.nextLine();
//        System.out.print("Hey I am "+tellMe);

        // CharAt
        String str = "Raju kumar";
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println(str.charAt(2)); // str[2];
        // str[2] = 'v' // it is not possible because string are immutable
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(6));

    }
}
