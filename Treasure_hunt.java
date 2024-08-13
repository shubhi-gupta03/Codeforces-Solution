import java.util.Scanner;

public class Treasure_hunt {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int x= in.nextInt();
            int y= in.nextInt();
            int k= in.nextInt();
            System.out.println(hunt(x,y,k));
        }
    }
    public static int hunt(int x,int y,int k){
        if(x>=y)
            return x;
        else{
            if(y-x<=k){
                return y;
            }else
                return 2*y-x-k;
        }
    }
}
