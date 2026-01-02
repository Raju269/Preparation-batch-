package OneDeminsionArray;

public class PassByValue {
    public static void print(int a ){
        a = 20 ; // Pass by  value
    }
    public static void main(String[] args) {
        int a = 10 ;
        print(a);
        System.out.println(a);
    }
}

