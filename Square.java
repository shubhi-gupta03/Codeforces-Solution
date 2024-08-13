import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int[] x=new int[4];
            int[] y=new int[4];
            for(int i=0;i<4;i++){
                x[i]=in.nextInt();
                y[i]=in.nextInt();
            }
            int z=0,b=0;
          if(x[1]!=x[2])
              z= x[1]-x[2];
          else
              z=x[1]-x[3];

          System.out.println(z*z);
        }
    }
}
