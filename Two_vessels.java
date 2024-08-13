import java.util.Scanner;

public class Two_vessels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t, a, b, c;
        t = in.nextInt();
        while (t-- > 0) {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            System.out.println(vessels(t, a, b, c));
        }
    }
    public static int vessels(int t,int a,int b,int c){

        int a1=Math.max(a,b);
        int b1=Math.min(a,b);
        int i=0;
        while(a1>b1){
            a1=a1-c;
            b1=b1+c;
            i++;
        }
        return i;
    }
}
