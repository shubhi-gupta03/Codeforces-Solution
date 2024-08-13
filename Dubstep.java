import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(dub(s));
    }
    public static String dub(String s){
        String sum=" ";
        sum=s.replace("WUB"," ");
        return sum.trim();
    }
}
