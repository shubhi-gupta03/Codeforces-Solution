import java.util.Scanner;

public class Raising_Bacteria {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int sum=0;
        while(x!=0){
            if(x%2==1){
                sum++;
            }
            x=x/2;
        }
        System.out.println(sum);
    }
}
