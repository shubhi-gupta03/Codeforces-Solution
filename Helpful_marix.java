import java.util.Scanner;

public class Helpful_marix {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s=in.nextLine();
        String sum=" ";
        for(int j='1';j<='3';j++){
        for(int i=0;i<s.length();i+=1){
                   if (s.charAt(i) == j) {
                       sum = sum + '+' + s.charAt(i);
                   }
               }

           }
        System.out.println(sum.substring(2));
    }
}
