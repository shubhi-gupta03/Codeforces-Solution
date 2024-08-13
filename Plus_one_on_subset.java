import java.util.Scanner;

public class Plus_one_on_subset {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            int max=0,min=a[0];
            for(int i=0;i<n;i++){
                 max=Math.max(a[i],max);
                 min=Math.min(a[i],min);
            }
            System.out.println(max-min);
        }
    }
}
