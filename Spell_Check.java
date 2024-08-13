import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Spell_Check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            String s = in.next();
            System.out.println(spell(n, s));
        }
    }

    public static String spell(int n, String s) {
       if(n!=5){
           return "NO";
       }
           ArrayList<Character> a = new ArrayList<>(n);
           for(int i=0;i<n;i++){
               a.add(s.charAt(i));
           }
       if(a.contains('T')&&a.contains('i')&&a.contains('m')&&a.contains('u')&&a.contains('r'))
            return "YES";
       else
           return "NO";
    }
}
