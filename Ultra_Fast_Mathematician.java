import java.util.Scanner;

public class Ultra_Fast_Mathematician {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.next();
        String b=in.next();
        String sum=" ";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(i))
                sum=sum+'0';
            else
                sum=sum+'1';
       }
        System.out.println(sum.trim());
    }
}
