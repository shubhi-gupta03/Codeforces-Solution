import java.util.Scanner;

public class Tricky_template {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t= in.nextInt();
        while(t-->0){
            int n= in.nextInt();
            String a= in.next();
            String b=in.next();
            String c=in.next();
            int ci=0;
            for(int i=0;i<n;i++){
                if(a.charAt(i)==c.charAt(i)||b.charAt(i)==c.charAt(i))
                    ci++;
            }
            if(ci==n)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
