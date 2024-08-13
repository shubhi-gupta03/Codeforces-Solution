import java.util.Scanner;

public class Soldier_and_bananas {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        int n=in.nextInt();
        int w=in.nextInt();
        System.out.println(bananas(k,n,w));
    }
    public static int bananas(int k,int n,int w){
        int p=0;
        for(int i=1;i<=w;i++){
            p=p+k*i;
        }
        if(p<n)
            return 0;
        else
            return p-n;
    }
}
