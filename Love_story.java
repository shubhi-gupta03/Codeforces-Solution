import java.util.Scanner;

public class Love_story {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s1="codeforces";
            int k=0;
            String s = in.next();
            for(int i=0;i<10;i++){
                if(s.charAt(i)!=s1.charAt(i)){
                    k++;
                }
            }
            System.out.println(k);
        }
    }
}
