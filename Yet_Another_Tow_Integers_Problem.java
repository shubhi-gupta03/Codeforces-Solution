import java.util.Scanner;

public class Yet_Another_Tow_Integers_Problem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            if(a==b)
                System.out.println(0);
            else if((Math.max(a,b)-Math.min(a,b))%10==0)
                System.out.println((Math.max(a,b)-Math.min(a,b))/10);
            else
                System.out.println((Math.max(a,b)-Math.min(a,b))/10+1);
        }
    }
}
