import java.util.Scanner;

public class Even_Odds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n, k;
        n = scanner.nextLong();
        k = scanner.nextLong();
        if (k <= (n + 1) / 2) {
            System.out.println(k * 2 - 1);
        } else {
            System.out.println((k - (n + 1) / 2) * 2);
        }
    }
}
