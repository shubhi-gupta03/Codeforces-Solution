import java.util.Scanner;

public class Lucky_Division {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(lucky_or_not(n));
    }
    public static String lucky_or_not(int n){
        int d=0,m=n;
        while(m!=0){
            d++;
            m=m/10;
        }
        if(d==1&&(n%4==0||n%7==0)){
            return("YES");
        }
        if(d==2&&(n%4==0||n%7==0||n%47==0||n%74==0)){
            return "YES";
        }
        if((d==3||d==4)&&(n%4==0||n%7==0||n%47==0||n%447==0||n%747==0||n%477==0||n%74==0||n%774==0||n%474==0||n%744==0)){
            return "YES";
        }else
            return "NO";
    }
}
