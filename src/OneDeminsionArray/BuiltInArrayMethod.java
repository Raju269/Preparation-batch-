package OneDeminsionArray;

import java.util.Arrays;

public class BuiltInArrayMethod {
    public static void main(String[] args) {
        int[] arr = {1,4,2,7,5,3,2};
        Arrays.sort(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
        //fill method ask in interview question
        int[] a = new int[6];
        System.out.println();
        Arrays.fill(a,10);
        for(int n : a){
            System.out.print(n+" ");
        }
        // Basic method skiha hai phale Arrays.sort() and Arrays.fill() methods only
        // Array copy of
        System.out.println();
        int[] newArr = Arrays.copyOf(a,10);
        for(int x : newArr){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println();
//         Array.copyofRange()
        int[] sub = Arrays.copyOfRange(arr,0,4);
        System.out.println(Arrays.toString(sub));
        System.out.println();
        System.out.println(Arrays.toString(sub));
        System.out.println(Arrays.equals(a,arr));

    }


}
