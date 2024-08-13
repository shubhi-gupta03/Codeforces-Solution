import java.util.Scanner;

public class SUM {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int c= in.nextInt();
            int max=Math.max(a,(Math.max(b,c)));
            if(max==a){
                if(b+c==max)
                    System.out.println("yes");
                else
                    System.out.println("no");
            }else
            if(max==b){
                if(a+c==max)
                    System.out.println("yes");
                else
                    System.out.println("no");
            }else
            if(max==c){
                if(b+a==max)
                    System.out.println("yes");
                else
                    System.out.println("no");
            }

        }
    }
}
