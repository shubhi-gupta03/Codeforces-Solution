import java.util.Scanner;

public class Young_physicist {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int x=0,y=0,z=0;
        while(n-->0){
            int[] kx=new int[3];
            for(int i=0;i<3;i++){
                kx[i]=in.nextInt();
            }
            x=x+kx[0];
            y=y+kx[1];
            z=z+kx[2];
        }
        if(x==0&&y==0&&z==0){
            System.out.println("YES");
        }else
            System.out.println("NO");
    }

}
