import java.util.Scanner;

public class Move_bracs {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n= in.nextInt();
            String s=in.next();
            System.out.println(bracs(s,n));
        }

    }
    public static int bracs(String s,int n){
            int c=0;
            int m=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='(')c++;
                else{
                    if(c==0)m++;
                    else c--;
                }
            }
            return m;
    }
}
