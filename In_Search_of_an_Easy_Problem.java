import java.util.Scanner;

public class In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int s=0;
        while(n-->0){
            int i=in.nextInt();
            s=s+i;
        }
        if(s>0)
            System.out.println("HARD");
        else
            System.out.println("EASY");
    }
}
