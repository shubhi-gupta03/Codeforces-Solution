import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class I_wanna_be_the_guy {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int p= in.nextInt();
        Set<Integer> x = new HashSet<>(p);
        for(int i=1;i<=p;i++){
            x.add(in.nextInt());
        }
        int q= in.nextInt();
        for(int i=1;i<=q;i++){
            x.add(in.nextInt());
        }
        if(x.size()==n)
            System.out.println("I become the guy.");
        else
            System.out.println("Oh, my keyboard!");
    }
}
