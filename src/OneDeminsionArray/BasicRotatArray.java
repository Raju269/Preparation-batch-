package OneDeminsionArray;

public class BasicRotatArray {
    public static void main(String[] args) {
        int[] arr = {10,23, 32,20,40,66,79,45,67,88};
        int n = arr.length;
        int i = 1;
        int j = 6;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int b: arr){
            System.out.print(b+" ");
        }
    }
}
