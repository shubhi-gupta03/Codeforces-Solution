import java.util.Scanner;

public class YES_or_yes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            if ((s.charAt(0) == 'y' || s.charAt(0) == 'Y') && (s.charAt(1) == 'e' || s.charAt(1) == 'E') && (s.charAt(2) == 's' || s.charAt(2) == 'S')) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}
