import java.util.Scanner;

public class Calculating_Function {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        long n=in.nextLong();
        System.out.println(function(n));
    }
    public static long function(long n){
        if(n%2==0)
            return n/2;
        else
        return -(n+1)/2;

    }
}
