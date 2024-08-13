import java.util.Scanner;

public class Plus_Minus_Split {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0) {
            int n=in.nextInt();
            String s = in.next();
            char[] a = s.toCharArray();
            int p = 0, d = 0;
            for (int i = 0; i < s.length(); i++) {
                if (a[i] == '-')
                    d++;
                else
                    p++;
            }
            System.out.println((d > p) ? d - p : p - d);
        }
    }
}
