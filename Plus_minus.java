import java.util.Scanner;

public class Plus_minus {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int c= in.nextInt();
            if(a+b==c){
                System.out.println("+");
            }else
                System.out.println("-");
        }
    }
}
