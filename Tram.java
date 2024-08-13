import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
            b[i]=in.nextInt();
        }
        System.out.println(tram(n,a,b));
    }
    public static int tram(int n,int[] a,int[] b){
        int max=0;
        for(int i=1;i<n-1;i++){
            int m=b[i-1]-a[i]+b[i];
            max=Math.max(max,m);
            b[i]=m;
        }
        return Math.max(max,b[0]);
    }
}
