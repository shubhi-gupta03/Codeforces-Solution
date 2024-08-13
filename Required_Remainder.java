import java.util.Scanner;

public class Required_Remainder {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t= in.nextInt();
        while (t-->0) {
            int x = in.nextInt();
            int y = in.nextInt();
            int n = in.nextInt();
            System.out.println(n - (n - y) % x);
        }
    }
}
