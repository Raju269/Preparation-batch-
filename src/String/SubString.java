package String;

public class SubString {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(s);
//        System.out.println(s.substring(2,3));
//        System.out.println(s.substring(1));

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                System.out.print(s.substring(i,j+1)+" ");
            }
            System.out.println();
        }
        System.out.println();
        String r = "Raju";
        for(int i=0;i<r.length();i++){
            for(int j=i;j<r.length();j++){
                System.out.print(r.substring(i,j+1)+" ");
            }
        }
    }
}
