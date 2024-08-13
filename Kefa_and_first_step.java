import java.util.ArrayList;
import java.util.Scanner;

public class Kefa_and_first_step {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int c=0,max=0;
        for(int i=0;i<n-1;i++){
            if(a[i]<=a[i+1]) {
                c++;
                max=Math.max(c,max);
            } else
                c=0;
        }
        System.out.println(max+1);
    }
}
