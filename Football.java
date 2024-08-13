import java.util.Scanner;
public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        int c= 1;
        for (int i = 1; i < s1.length(); i++) {
            if (s1.charAt(i) == s1.charAt(i - 1)) {
                c++;
                if (c == 7) {
                    System.out.println("YES");
                    return;
                }
            } else {
                c    = 1;
            }
        }
        System.out.println("NO");
    }
}