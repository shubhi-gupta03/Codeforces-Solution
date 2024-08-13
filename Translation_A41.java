import java.util.Scanner;

public class Translation_A41 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s= in.next();
        String t=in.next();
        String t1="";
        for(int i=s.length()-1;i>=0;i--){
            t1=t1+s.charAt(i);
        }
        if(t.equals(t1))
            System.out.println( "YES");
         else
            System.out.println("NO");
    }
}
