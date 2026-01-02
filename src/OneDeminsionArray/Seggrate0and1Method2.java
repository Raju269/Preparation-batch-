package OneDeminsionArray;

import javax.swing.*;

public class Seggrate0and1Method2 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,0,1,0,1,1,0};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==0){
                i++;
            } else if (arr[j]==1)  {
                j--;
            } else if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        for(int i1: arr){
            System.out.print(i1+" ");
        }
    }
}
