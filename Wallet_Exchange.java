import java.util.Scanner;

public class Wallet_Exchange {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            if((a>b?a-b:b-a)%2==0)
                System.out.println("Bob");
            else
                System.out.println("Alice");

        }
    }
}
