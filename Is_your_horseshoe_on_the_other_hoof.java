import java.util.Arrays;
import java.util.Scanner;

public class Is_your_horseshoe_on_the_other_hoof {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] s=new int[4];
        for(int i=0;i<4;i++){
            s[i]=in.nextInt();
        }
        Arrays.sort(s);
        int m=0;
        for(int i=0;i<3;i++){
           if(s[i]==s[i+1]){
               m++;
           }
        }
        System.out.println(m);
    }
}
