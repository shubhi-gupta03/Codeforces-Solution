import java.util.Scanner;

public class Chewbacca_and_Number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        char[] a=in.next().toCharArray();
        for(int i=0;i<a.length;i++) {
            if (a[i] > '4') {
                a[i] = (char) ('9' - a[i] +'0');
            }
        }
            if (a[0] == '0')
                a[0] = '9';
        System.out.println(a);
    }
}
