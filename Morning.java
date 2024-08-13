import java.util.Scanner;

public class Morning {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            String s=in.next();
            System.out.println(morning(s));
        }
    }
    public static int morning (String s) {
        int m = 0, k = 0;
        if (s.charAt(0) == '0') {
            k = 9;
        } else {
            k = Character.getNumericValue(s.charAt(0)) - 1;
        }
        for (int i = 0; i < 3; i++) {
            int a = Character.getNumericValue(s.charAt(i));
            int b = Character.getNumericValue(s.charAt(i + 1));
            if(a!=b) {
                if (a != 0 && b != 0) {
                    k = k + (Math.max(a, b) - Math.min(a, b));
                } else {
                    k = k + (10 - Math.max(a, b));
                }
            }
        }
        return k+4+m;
    }

}
