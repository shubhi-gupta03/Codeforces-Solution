import java.util.Scanner;

public class Theater_Square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        long m = in.nextInt();
        long a = in.nextInt();

        long d=0, k=0;
        if (n % a != 0)
            d = n / a + 1;
        if (n % a == 0)
            d = n / a;
        if (m % a != 0)
            k = m / a + 1;
        if (m % a == 0)
            k = m / a;
        System.out.println(d * k);

    }
}
