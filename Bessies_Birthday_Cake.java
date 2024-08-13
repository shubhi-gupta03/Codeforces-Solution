import java.util.Arrays;
import java.util.Scanner;

public class Bessies_Birthday_Cake {
    public static void main(String[] args) {
        Scanner in=new Scanner( System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int x=in.nextInt();
            int y=in.nextInt();
            int[] s=new int[x];
            for(int i=0;i<x;i++){
                s[i]=in.nextInt();
            }
            System.out.println(nonIntersectingTriangles(n,x,y,s));
        }
    }
    public static int nonIntersectingTriangles(int n,int x,int y,int[] s){
        Arrays.sort(s);
        int u=x-2;
        if(s[0]-1+(n-s[x-1])==1) u++;
        for(int i=1;i<x;i++){
            if(s[i]-s[i-1]==2) u++;
        }
        return u;
    }
}
