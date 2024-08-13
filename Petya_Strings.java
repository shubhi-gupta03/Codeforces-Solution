import java.util.Scanner;

public class Petya_Strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String s2 = in.next();
        System.out.println(petya(s, s2));
    }

    public static int petya(String s, String s2) {
        s = s.toLowerCase();
        s2 = s2.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s2.charAt(i) && s.charAt(i) > s2.charAt(i)) {
                return 1;
            } else if (s.charAt(i) != s2.charAt(i) && s.charAt(i) < s2.charAt(i)) {
                return -1;
            }
        }
        return 0;
    }
}

