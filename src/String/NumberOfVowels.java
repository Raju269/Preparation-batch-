package String;

import java.util.Scanner;

public class NumberOfVowels {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the value ");
        String str1 = src.nextLine();
        int count  = 0;
        for(int i=0;i<str1.length();i++){

            if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='i' || str1.charAt(i)=='o'||str1.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
