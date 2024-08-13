import java.util.Scanner;

public class Sum_of_Round_numbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            round(n);
        }
    }
    public static void round(int n){
        int m=n,c=0;
        int k=0;
        while(m!=0){
            int s=m%10;
            if(s!=0)
                k++;
            m/=10;
        }
        System.out.println(k);
        int[] a=new int[k];
        while(n!=0){
            int d=n%10;
            if(d!=0) {
                a[k-1] = d * (int) Math.pow(10, c);
                k--;
            }
            c++;
            n=n/10;
        }
         for(int i=0;i<a.length;i++){
             System.out.print(a[i]+" ");
         }
    }
}
