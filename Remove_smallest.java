import java.util.Arrays;
import java.util.Scanner;

public class Remove_smallest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            Arrays.sort(a);
            System.out.println(only_one(n,a));
        }
    }
    public static String only_one(int n,int[] a) {
        for (int i = 0; i < n - 1; i++) {
            if (a[i + 1] - a[i] > 1)
                return "NO";
        }
        return "YES";
    }
}
