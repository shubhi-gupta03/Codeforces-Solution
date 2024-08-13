import java.util.Scanner;

public class Wrong_substraction {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k= in.nextInt();
        System.out.println(sub(n,k));
    }
    public static int sub(int n,int k){
        for(int i=0;i<k;i++){
            int d=n%10;
            if(d==0){
                n=n/10;
            }else
                n-=1;
        }
        return n;
    }
}
