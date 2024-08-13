import java.util.ArrayList;
import java.util.Scanner;

public class Diverse_game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = in.nextInt();
                }
            }
            int k = check(n, m, a);
            if (k == -1)
                System.out.println(k);
            else {
                int[][] b = new int[n][m];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        b[i][j] = a[(i + n / 2) % n][(j + m / 2) % m];
                        System.out.print(b[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
    public static int check (int n,int m,int[][] a){
            ArrayList<Integer> s = new ArrayList<>();
            int k = 0;
            if(n==1&&m==1)
                return -1;
            for (int i = 0; i < n / 2 + 1; i++) {
                for (int j = 0; j < m / 2 + 1; j++) {
                    if (!s.contains(a[i][j])) {
                        s.add(a[i][j]);
                    } else {
                        return -1;
                    }
                }
            }
            return 1;
        }
}
