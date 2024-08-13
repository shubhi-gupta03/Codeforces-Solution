import java.util.*;
public class Queue_at_the_school {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        String s = in.next();
        while (t-- > 0) {
             s=(s.replaceAll("BG","GB"));
        }
        System.out.println(s);
    }
}