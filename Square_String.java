import java.util.Scanner;

public class Square_String {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            String s=in.next();
            square(s);
        }
    }
    public static void square(String s) {
        String s1 = "", s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (i < (s.length() / 2)) {
                s1 = s1 + s.charAt(i);
            } else
                s2 = s2 + s.charAt(i);
        }
        s1 = s1.trim();
        s2 = s2.trim();
        if(s1.equals(s2)){
            System.out.println("yes");
        }else
            System.out.println("no");
    }
}
