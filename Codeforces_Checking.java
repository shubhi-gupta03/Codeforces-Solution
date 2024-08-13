import java.util.Scanner;

public class Codeforces_Checking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            char c = in.next().charAt(0);
            String s = "codeforces";
            System.out.println(check(c, s));
        }
    }

    public static String check(char c, String s) {
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                return "YES";
            }
        }
        return "NO";
    }
}
