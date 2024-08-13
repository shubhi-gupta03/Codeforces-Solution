import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Chat_Room {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        hello(s);
    }

    public static void hello(String s) {
        String s1 = "hello";
        int j = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s1.charAt(j)) {
                j++;
                c++;
            }
            if (c == 5)
                break;
        }
        if (c == 5) {
            System.out.println("YES");
        } else
            System.out.println("NO");
    }
}
