import java.util.Scanner;

public class Bit{
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int n=in.nextInt();
        String s;
        int x=0;
        for(int i=0;i<n;i++) {
            s = in.next();
            if (s.charAt(1) == '+') {
                x++;
            } else
                x--;
        }
            System.out.println(x);
    }
}