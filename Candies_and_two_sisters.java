import java.util.*;

public class Candies_and_two_sisters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            System.out.println(candies(n));
        }
    }
    public static int candies(int n){
        int a=n-n/2,b=n/2,c=0;
        if(a>b) {
            return c = b;
        }
        else
            return c=b-1;
    }
    /*public static int candies(int n){
        int a = n-1, b = 1, c = 0;
        while (a > b) {
            a = a - 1;
            b = b + 1;
            c++;
        }
        return c;
    }*/
}
