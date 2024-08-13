import java.util.Scanner;

public class NextRound {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++) a[i]=in.nextInt();
        System.out.println(selected(a,k,n));
    }

    public static int selected(int a[],int k,int n) {
        int c=0;
        for (int i=0;i<n;i++){
            if(a[i] >= a[k-1] && a[i]>0 ) c++;
        }
        return c;
    }
}
