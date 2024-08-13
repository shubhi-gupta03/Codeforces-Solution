import java.util.Scanner;

public class Farmer_Johns_Challenge {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int k=in.nextInt();
            array(n,k);
        }
    }
    public static void array(int n,int k){
        int[] a=new int [n];
        if(k==1){
            a[0]=n;
            for(int i=1;i<n;i++){
                a[i]=i;
            }
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }else if(n==k){
            for(int i=0;i<n;i++){
                System.out.print(1+" ");
            }
            System.out.println();
        }else
            System.out.println(-1);
    }
}
