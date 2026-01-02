package OneDeminsionArray;

public class PassbyReferrence {
    public static void main(String[] args) {
        int[] arr = {21,23,22,25,24};
        print(arr);
        System.out.println(arr[0]); // Pass by reference
    }
    public static void print(int[] arr){
        arr[0] = 2;
    }
}
