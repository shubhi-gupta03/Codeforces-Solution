import java.util.Scanner;

public class Spy_detected {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            System.out.println(detect(n,a));
        }
    }
    public static int detect(int n,int[] a){
       if(a[0]!=a[1]&&a[1]==a[2])
           return 1;

        for (int i=1;i<n;i++){
           if(a[i]!=a[i-1])
               return i+1;
       }
       return 0;
    }
}
