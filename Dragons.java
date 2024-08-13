import java.util.Arrays;
import java.util.Scanner;

public class Drecarys {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int s=in.nextInt();
        int n=in.nextInt();
        int[] x=new int [n];
        int[] y=new int[n];
        for(int i=0;i<n;i++){
            x[i]=in.nextInt();
            y[i]=in.nextInt();
        }

        System.out.println(dragon(s,n,x,y));
    }
    public static String dragon(int s,int n,int[] x,int[] y){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(x[j]>x[j+1]){
                    int temp=x[j+1];
                    x[j+1]=x[j];
                    x[j]=temp;
                    int t=y[j+1];
                    y[j+1]=y[j];
                    y[j]=t;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(s<x[i]||s==x[i]){
                return "NO";
            }
            else
                s=s+y[i];
        }
        return "YES";
    }
}
