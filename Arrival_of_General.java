import java.util.Scanner;

public class Arrival_of_General {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int max=-1,ma=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int min=a[0],mi=0;
        for(int i=0;i<n;i++){
            if(a[i]<=min){
                min=a[i];
                mi=i;
            }
            if(a[i]>max){
                max=a[i];
                ma=i;
            }
        }
        int s=(n-1-mi)+ma;
        if(mi<ma)
            System.out.println(s-1);
        else
            System.out.println(s);
    }
}
