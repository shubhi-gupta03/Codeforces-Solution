import java.text.CharacterIterator;
import java.util.Scanner;

public class Word_Capitalization {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(capitalization(s));
    }
    public static String capitalization(String s){
        s=(Character.toUpperCase(s.charAt(0)))+s.substring(1);
        return s;
    }
}
