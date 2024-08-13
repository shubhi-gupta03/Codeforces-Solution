import java.util.Scanner;

public class How_much_dayton_cost {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int k=in.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]= in.nextInt();
            }
            System.out.println(dayton(n,k,a));
        }
    }
    public static String dayton(int n,int k,int a[]){
       for(int i=0;i<n;i++){
        if(a[i]==k)
            return "yes";
        }
       return "no";
    }
}
