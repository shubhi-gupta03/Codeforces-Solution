import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        System.out.println(count(x));
    }
    public static  int count (int x){
        int c=0;
        while(x!=0){
            if(x>=5){
                c++;
                x=x-5;
            }if(x==4){
                c++;
                x-=4;
            }if(x==3){
                c++;
                x-=3;
            }if(x==2){
                c++;
                x-=2;
            }if(x==1){
                c++;
                x-=1;
            }
        }
        return c;
    }
}
