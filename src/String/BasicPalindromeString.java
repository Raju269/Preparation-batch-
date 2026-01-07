package String;

import java.util.Scanner;

public class BasicPalindromeString {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the value ");
        String s = src.nextLine();
        int i = 0;
        int j = s.length()-1;
        boolean is = true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                is = false;
                break;
            }
            i++;
            j--;
        }
        if(is){
            System.out.println("is Palindrome");
        }
        else{
            System.out.println("is not palindrome");
        }

    }
}
