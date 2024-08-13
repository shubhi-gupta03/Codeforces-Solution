import java.util.Scanner;

public class Arranging_cats {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            String s=in.next();
            String f=in.next();
            int max=0,z=0,o=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='1'&&f.charAt(i)=='0')
                    o++;
                else if(s.charAt(i)=='0'&&f.charAt(i)=='1')
                    z++;
            }
            System.out.println(Math.max(o,z));
        }
    }
}
