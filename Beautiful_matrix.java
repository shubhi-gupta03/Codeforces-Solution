import java.util.Scanner;

public class Beautiful_matrix {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] a=new int [5][5] ;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                a[i][j]=in.nextInt();
            }
        }
        int k=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(a[i][j]==1){
                    if(i<=2&&j<=2){
                        k=4-i-j;
                    }else if(i>=2&&j>=2){
                        k=i+j-4;
                    }else if(i<=2&&j>=2){
                        k=(2-i)+j-2;
                    }else
                        k=(2-j)+i-2;
                }
            }
        }
        System.out.println(k);
    }
}
