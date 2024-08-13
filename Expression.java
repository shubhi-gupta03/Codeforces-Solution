import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int m=a+(b*c);
        int n=a*(b+c);
        int o=a*b*c;
        int p=(a+b)*c;
        int q=a+b+c;
        System.out.println(max(m,n,o,p,q));
    }
    public static int max(int m,int n,int o,int p,int q){
        int max = m;
        if (n > max)
            max = n;
        if (o > max)
            max = o;
        if (p > max)
            max = p;
        if(q>max)
            max=q;

        return max;
    }
}
