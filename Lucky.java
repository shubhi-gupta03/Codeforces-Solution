import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            int f = 0, r = 0;
            for (int i = 0; i < 6; i++) {
                int k = Integer.valueOf(s.charAt(i));
                if (i < 3) {
                    f = f + k;
                } else
                    r = r + k;
            }
            if (f == r)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
