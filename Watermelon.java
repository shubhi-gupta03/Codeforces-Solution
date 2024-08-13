import java.util.*;
public class Watermelon
{
    public static void main(String[]args)
    {
        Scanner i=new Scanner(System.in);
        int sum=0,n=i.nextInt(),k=i.nextInt(),z[]=new int[n];
        for(int q=0;q<n;z[q++]=i.nextInt());
        for(int q=0;q<n;q++)
            if(z[q]>=z[k-1]&&z[q]>0)
                sum++;
        System.out.println(sum);
    }
}