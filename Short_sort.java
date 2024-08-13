import java.util.Scanner;

public class Short_sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
         String s= in.next();
            System.out.println(sort(s));
        }
    }
    public static String sort(String s){

        if(s.equals("acb") || s.equals("abc") || s.equals("bac") || s.equals("cba"))
            return "yes";
        else
            return "no";
    }
}
