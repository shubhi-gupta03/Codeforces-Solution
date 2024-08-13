import java.util.Scanner;

public class The_New_Year_Meeting_Friends {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x1=in.nextInt();
        int x2= in.nextInt();
        int x3= in.nextInt();
        int a = Math.min(x3, (Math.min(x1, x2)));
        int b = Math.max(x3, (Math.max(x1, x2)));
        if (a != x2 && b != x2) {
            System.out.println((b - x2) + (x2 - a));
        } else if (a != x1 && b != x1) {
            System.out.println ((b - x1) + (x1 - a));
        } else {
            if (a != x3 && b != x3)
                System.out.println((b - x3) + (x3 - a));
        }
    }
}
