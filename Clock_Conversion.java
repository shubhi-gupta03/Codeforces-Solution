import java.util.Scanner;

public class Clock_Conversion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            String s=in.next();
            System.out.println(conversion(s));
        }
    }
    public static String conversion(String s){
        String sum="";
        int i=Integer.valueOf(s.substring(0,2));
        if(s.startsWith("00")){
            sum="12:"+s.substring(3)+" AM";
        }else
        if(i>12){
            i=i-12;
            sum="0"+String.valueOf(i)+s.substring(2)+" PM";
            if(sum.length()>8)
                sum=sum.substring(1);
        }
        else if(i<12){
            sum=s+" AM";
        }
        else
            sum=s+" PM";
        return sum;
    }
}
