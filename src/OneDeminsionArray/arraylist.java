package OneDeminsionArray;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(arrayList.size());
        arrayList.add(10); arrayList.add(20); arrayList.add(30);arrayList.add(40);
        System.out.println(arrayList.size());
        for(int i:arrayList){
            System.out.print(i+" ");
        }
        System.out.println();
        arrayList.add(50); arrayList.add(60); arrayList.add(70);arrayList.add(80);
        System.out.println(arrayList.size());
        for(int i:arrayList){
            System.out.print(i+" ");
        }
        arrayList.remove(4);
        System.out.println();
         for(int i:arrayList){
            System.out.print(i+" ");
        }
        System.out.println();
         arrayList.set(2,234);
        System.out.println(arrayList);

        // Reverse arraylist
        int i=0;
        int j = arrayList.size() - 1;
        while(i<j){
            int temp = arrayList.get(i);
            int temp1 = arrayList.get(j);
            arrayList.set(i,temp1);
            arrayList.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arrayList);

        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
