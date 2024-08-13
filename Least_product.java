import java.util.Scanner;

public class Least_product {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0) {
            int n = in.nextInt();
            int[] a = new int[n];
            int negga = 0, z = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                if (a[i] < 0)
                    negga++;
                if (a[i] == 0)
                    z++;
            }
            if (negga % 2 != 0 || z != 0)
                System.out.println(0);
            else {
                System.out.println(1);
                System.out.println(1 + " " + 0);
            }
        }
    }
}
