import java.util.Scanner;

public class New_year {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t= in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int k=in.nextInt();
            int[] b=new int[n];
            for(int i=0;i<n;i++){
                b[i]=in.nextInt();
            } long m=1;
            for(int i=0;i<n;i++){
                m*=b[i];

            }
            if(m<=2023&&2023%m==0){
                System.out.println("yes");
                for(int i=0;i<k-1;i++){
                    System.out.print(1+" ");
                }
                System.out.println(2023/m);
            }
            else System.out.println("No");
        }
    }
}
