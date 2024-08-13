import java.util.Scanner;

public class Team {
    public static void main(String agrs[])
    {
        Scanner in=new Scanner(System.in);
        int n,p,v,t,s=0;
        n=in.nextInt();
        while(n-->0){
            p=in.nextInt();
            v=in.nextInt();
            t=in.nextInt();
            if((p+v+t)>1){
                s++;
            }
        }
        System.out.println(s);
    }
}
