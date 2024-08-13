import java.util.Scanner;

public class Divisibility_problem {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        int t=i.nextInt();
        while(t-->0){
            int a=i.nextInt();
            int b=i.nextInt();
         if(a%b==0)
             System.out.println(0);
         else
             System.out.println(b-(a%b));
        }
    }
}
