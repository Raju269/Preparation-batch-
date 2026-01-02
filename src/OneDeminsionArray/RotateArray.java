package OneDeminsionArray;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {11,21,32,43,45,65,78,82 ,23};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
//        int i=2;
//        int j=arr.length-1;
//        while(i<j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//        System.out.println();
//        for(int ele : arr){
//            System.out.print(ele+" ");
//        }
        System.out.println();
        int n = arr.length;
        int d = 12;
        d = d%n;
        rotate(arr,0,d-1);
        rotate(arr,d,n-1);
        rotate(arr,0,n-1);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void rotate(int[] arr , int i , int j ){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
