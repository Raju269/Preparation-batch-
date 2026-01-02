package OneDeminsionArray;

public class SecondMinimumElement {
    public static void main(String[] args) {
        int[] arr = {42,47,89,12,9,72,62};
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<smin && arr[i]!=min){
                smin = arr[i];
            }
        }
        System.out.println("The 2nd minimum element is :  "+smin);
    }
}
