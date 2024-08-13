import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Anton_and_polyherdon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum;
        String str;
        while (sc.hasNextInt()) {
            n = sc.nextInt();
            sum = 0;
            while (n-- > 0) {
                str = sc.next();
                if (str.equals("Tetrahedron"))
                    sum += 4;
                else if (str.equals("Cube"))
                    sum += 6;
                else if (str.equals("Octahedron"))
                    sum += 8;
                else if (str.equals("Dodecahedron"))
                    sum += 12;
                else if (str.equals("Icosahedron"))
                    sum += 20;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}