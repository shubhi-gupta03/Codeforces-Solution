import java.util.Scanner;

public class Stair_Peak_or_Neither {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            System.out.println(count(a,b,c));
        }
    }
    public static String count(int a,int b,int c) {
//        if(a!=c&&a!=b) {
//            int s = (a < b) ? (Math.max(b, c)) : a;
//            if (s == c)
//                return "STAIR";
//            if (s == b)
//                return "PEAK";
//            else
//                return "NONE";
//        }else
//            return "NONE";

        if (c > b && b > a)
            return "STAIR";
        if (a < b && b > c)
            return "PEAK";
        if (a > b && a > c)
            return "NONE";
        return "NONE";
    }
}
