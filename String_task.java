import java.util.Scanner;

public class String_task {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(task(s));
    }
    public static String task(String s){
        s=s.toLowerCase();
        String sum=" ";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='u'||s.charAt(i)=='o'||s.charAt(i)=='y'){
                sum=sum;
            }else {
             sum=sum+'.'+s.charAt(i);
            }
        }
        sum=sum.trim();
        return sum;

    }

}
