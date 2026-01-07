package String;

import java.util.Scanner;

public class StringConcepts {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

//        System.out.println("Your name is  :"+name1);

//        Charat() and length().
        String sr = "Raju kumar";
//        System.out.println(sr.length());
//        for(int i=0;i<sr.length();i++){
//            System.out.print(sr.charAt(i)+" ");
//        }
//        Count then no of Vomels in a given Strings
          System.out.print("Enter the your name is : ");
        String name1 = src.nextLine();
        int count  = 0;
        for(int i =0;i<name1.length();i++){
            if(name1.charAt(i)=='a'||name1.charAt(i)=='e'||name1.charAt(i)==i||name1.charAt(i)=='o'||name1.charAt(i)=='u'){
                count++;

            }

        }
        System.out.println("No of vowels is : "+ count);
    }
}
