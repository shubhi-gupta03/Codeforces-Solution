import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        String s=in.next();
        System.out.println(word(s));
    }
    public static String word(String s){
        int u=0,l=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<123&&s.charAt(i)>96)
                l++;
            else if(s.charAt(i)<91&&s.charAt(i)>64)
                u++;
        }
        if(l>u)
            return(s.toLowerCase());
        else if(l<u)
            return (s.toUpperCase());
        else
            return (s.toLowerCase());
    }
}
