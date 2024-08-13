import java.util.Scanner;

public class Nearly_lucky_Number {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        long n=in.nextLong();
        System.out.println(lucky(n));
    }
    public static String lucky(long n){
        int c=0,l=0;
        while(n!=0){
            long d=n%10;
            c++;
            if(d==4||d==7){
                l++;
            }
            n=n/10;
        }
        if(l==4||l==7)
            return "YES";
        else
            return "NO";
    }
}
