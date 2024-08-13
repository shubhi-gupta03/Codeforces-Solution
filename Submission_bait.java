import java.util.HashMap;
import java.util.Scanner;

public class Submission_bait {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            System.out.println(bait(n,a));
        }
    }
    public static String bait(int n,int[] a){
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!hp.containsKey(a[i]))
                hp.put(a[i],1);
            else
                hp.put(a[i],(hp.get(a[i]))+1);
        }
        for(int i=0;i<n;i++){
            if(hp.get(a[i])%2!=0)
                return "YES";
        }
        return "NO";
    }
}
