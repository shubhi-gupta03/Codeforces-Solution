import java.util.Scanner;

public class Beautiful_year {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int y= in.nextInt();
        System.out.println(year(y));
    }
    public static int year(int y){
        int k=y+1;
        String s = Integer.toString(k);
        for(int i=0;i<4;i++){
            for(int j=i+1;j<4;j++){
                if(s.charAt(i)==s.charAt(j))
                    return year(y+1);
            }
        }
        return k;
    }
}
