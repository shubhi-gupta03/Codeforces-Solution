import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(hulk(n));
    }
    public static String hulk(int n){
        String s=" ";
        for(int i=1;i<n;i++){
            if(i%2==0)
                s=s+" "+"I love that";
            if((i%2)!=0)
                s=s+" "+"I hate that";
        }
        if(n%2==0) {
            s = s + " " + "I love it";
        }else {
            s = s + " " + "I hate it";
        }
        return s.trim();
    }
}
