import java.util.Scanner;

public class Closest_point {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int[] x=new int[n];
            for(int i=0;i<n;i++){
                x[i]=in.nextInt();
            }
            if(n==2&&x[0]+1!=x[1])
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
