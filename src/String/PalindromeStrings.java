package String;

import java.util.Scanner;

public class PalindromeStrings {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Check the Palindrome enter the value ");
        String s = src.nextLine();
        int  i = 0;
        int j = s.length()-1;
        boolean isPalindrome = true;
        while (i<j){
            if(s.charAt(i)!=s.charAt(j)){
                isPalindrome = false;
                break;
            }
            i++;
            j--;

        }
         if (isPalindrome){
                System.out.println("Palindrome");
            }
            else {
                System.out.println("not Palindrome");
            }
    }
}
