import java.util.Scanner;

public class Vanya_and_Fence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(vanya(n, k, a));
    }
    public static int vanya(int n,int k,int a[]){
        int s=0;
        for(int i=0;i<n;i++){
                if(a[i]>k){
                    s=s+2;
                }else
                    s=s+1;
            }
        return s;
    }
}
