package OneDeminsionArray;

public class seggrate0and1 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,0};
        int zero = 0;
        int ones = 0;
        for (int j : arr) {
            if (j == 0) zero++;
            ones++;
        }
        for(int i=0;i<zero;i++) {
            arr[i] = 0;
        }
        for(int i=zero;i< arr.length;i++){
                arr[i] =1;
            }

        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
