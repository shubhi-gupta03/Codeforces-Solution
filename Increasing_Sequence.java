import java.util.Scanner;

public class Increasing_Sequence {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            int b[]=new int [n];
            if(a[0]==1){
                b[0]=2;
            }else
                b[0]=1;
            for(int i=1;i<n;i++){
                if(b[i-1]+1!=a[i]){
                    b[i]=b[i-1]+1;
                }else {
                    b[i]=a[i]+1;
                }
            }
            System.out.println(b[n-1]);
        }
    }
}
