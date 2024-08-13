import java.util.Scanner;

public class Capslock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(capslock(s));
    }

    public static String capslock(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) >= 97)
                return s;
        }
        if (s.charAt(0) < 97) {
            return (s.toLowerCase());
        } else {
          s=s.toLowerCase();
          char a=Character.toUpperCase(s.charAt(0));
          return (a+s.substring(1));
        }
    }
  }
