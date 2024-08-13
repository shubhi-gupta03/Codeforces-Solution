import java.util.Scanner;
public class Three_threadlets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int m = Math.min(c, (Math.min(a, b)));
            if (a % m == 0 && b % m == 0 && c % m == 0) {
                m = (a / m + b / m + c / m) - 3;
                if (m <= 3)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            } else {
                System.out.println("NO");
            }
        }
    }
}