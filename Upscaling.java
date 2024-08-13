import java.util.Scanner;

public class Upscaling {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            matrix(n);
        }
    }
    public static void matrix(int n) {
       for (int i=0;i<n;i++){
           for(int k=0;k<2;k++){
               for(int j=0;j<n;j++){
                   if((i+j)%2==0)
                       System.out.print("##");
                   else
                       System.out.print("..");
               }
               System.out.println();
           }
       }
    }
}

