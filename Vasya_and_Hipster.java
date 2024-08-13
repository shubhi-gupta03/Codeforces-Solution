import java.util.Scanner;

public class Vasya_and_Hipster {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.print((Math.min(a,b))+" ");
        System.out.println((Math.max(a,b)-Math.min(a,b))/2);
    }
}
