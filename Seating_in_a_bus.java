import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Seating_in_a_bus
   {
       public static void main(String[] args) {
           Scanner in=new Scanner(System.in);
           int t=in.nextInt();
           while(t-->0){
               int n=in.nextInt();
               int[] a=new int[n];
               for(int i=0;i<n;i++){
                   a[i]=in.nextInt();
               }
                   System.out.println(seating_plan(n,a));
           }
       }
       public static String seating_plan(int n,int[] a){
           HashSet<Integer> l=new HashSet<>();
           l.add(a[0]);
           for(int i=1;i<n;i++){
              if(l.contains(a[i]-1)||l.contains(a[i]+1))
                  l.add(a[i]);
              else
                  return "NO";
           }
           return "YES";
       }
}
