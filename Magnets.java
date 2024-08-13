import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++){
            a[i]=in.next();
        }
        System.out.println(magnets(n,a));
    }
    public static  int magnets(int n,String a[]){
        int d=0;
        for(int i=0;i<n-1;i++){
            if(!a[i].equals(a[i+1]))
               d++;

        }if(n>1)
        return d+1;
        else
            return 1;
    }
}
