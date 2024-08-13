import java.util.Scanner;

public class Stones_on_the_tables {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        String s=in.next();
        System.out.println(stones(s,t));
    }
    public static int stones(String s,int t){
        int r=0;
        for(int i=0;i<t-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                r++;
            }
        }
        return r;
    }
}
