import java.util.Scanner;

public class Xenia_and_Ringroad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int x = 1,  y=0;
        long k = 0;
        while (m-- > 0) {
            y = in.nextInt();
            if (x > y)
                k += n + (-x + y);
            else
                k += y - x;
            x = y;
        }
        System.out.println(k);
    }
}