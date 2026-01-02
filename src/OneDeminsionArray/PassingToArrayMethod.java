package OneDeminsionArray;

public class PassingToArrayMethod {
    public static void main(String[] args) {
        int[] arr = {10,20 ,30 ,40,50};
        print(arr);
    }
    public static void print(int[] arr){
        for (int j : arr) {
            System.out.print(j + 10 + " ");
        }
    }
}
