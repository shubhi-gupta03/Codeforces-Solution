import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),k;
        int[] a=new int[n+1];
        for(int i=1;i<=n;i++){
            k=in.nextInt();
            a[k]=i;
        }
        for(int i=1;i<=n;i++){
            System.out.print(a[i]+" ");

        }
    }
}
