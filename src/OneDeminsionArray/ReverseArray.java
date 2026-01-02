package OneDeminsionArray;

public class ReverseArray {
    public static void main(String[] args) {
//          Reverse Array
    int[]  arr = {1,2,3,4,5,6,7};
    int n = arr.length;
    int i=0;
    int j= n-i-1;
    while(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
    for(int i1:arr){
        System.out.print(i1+" ");
    }
    }
}
