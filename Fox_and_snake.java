import java.util.Scanner;

public class Fox_and_snake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if ((i % 4 == 0 && j == 1) || (i % 2 != 0) || (i % 4 != 0 && j == m))
                    System.out.print("#");
                else
                    System.out.print(".");
            }
            System.out.println();
        }
    }
}

