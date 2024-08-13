import java.util.Scanner;

public class Rating_increase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            String ab=in.next();
            if(!rating(ab).equals("no"))
                System.out.println(rating(ab));
            else
                System.out.println(-1);
        }
    }
    public static String rating(String ab){
        int n=ab.length();
        String sum="",s;
        for(int  i=0;i<n-1;i++){
            sum+= ab.charAt(i);
            s=ab.substring(i+1);
            if(Integer.parseInt(sum)<Integer.parseInt(s)&&s.charAt(0)!='0')
                return(sum+" "+s);
        }
        return "no";
    }
}
