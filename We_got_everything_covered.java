import java.util.Scanner;

public class We_got_everything_covered {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int k=in.nextInt();
            String s="";
            int j=97;
            for(int i=1;i<=n*k;i++) {
                if ((j - 97) < k) {
                    s = s +(char)j;
                    j++;
                }else {
                    j = 97;
                    s=s+(char)j;
                    j++;
                }
            }
            System.out.println(s);
        }
    }
}
