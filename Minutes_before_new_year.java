import java.util.Scanner;

public class Minutes_before_new_year {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int h= in.nextInt();
            int m= in.nextInt();
            System.out.println(((23-h)*60)+60-m);
        }
    }
}
