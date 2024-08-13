import java.util.Scanner;

public class George_and_accommodation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int d=0;
        while(n-->0){
            int p= in.nextInt();
            int q= in.nextInt();
            if(q-p>1)
                d=d+1;
        }

        System.out.println(d);
    }
}
