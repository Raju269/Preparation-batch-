package String;

import java.util.Scanner;

public class SumofSubstring {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the value ");
        String s = src.nextLine();
        int sum  = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                System.out.print(s.substring(i,j+1)+ " + ");
                String s1 = s.substring(i,j+1);
                int x = Integer.parseInt(s1);
                sum += x;
            }
        }
        System.out.println();
        System.out.println("The sum all item is : "+sum);

    }
}
