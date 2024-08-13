import java.sql.SQLOutput;
import java.util.Scanner;
public class WayToLongWord {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while(t-->0){
            String s = in.next();
            System.out.println(word(s));
        }

    }
    public static String word(String s) {
        if (s.length() > 10) {
            String s1;
            s1=Integer.toString(s.length()-2);
            return (s.charAt(0)+s1+s.charAt(s.length()-1));
        } else
            return s;
    }
}
