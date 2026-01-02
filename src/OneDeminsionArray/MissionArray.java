package OneDeminsionArray;

public class MissionArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int n = arr.length + 1;
        int sum = 0;
        int indexTotalSum = (n*(n+1)/2);
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println(sum);
        System.out.println(indexTotalSum);
        int missingElement = indexTotalSum - sum;
        System.out.println("Missing element is : "+missingElement);
    }
}
