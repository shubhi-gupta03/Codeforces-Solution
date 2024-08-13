import java.util.Scanner;

public class Is_it_started {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            String s=in.next();
            System.out.println(started(s));
            }

        }
        public static String started(String s) {
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i - 1) == 'i' && s.charAt(i) == 't') {
                    return "YES";
                }
            }
            return "NO";
        }
}
