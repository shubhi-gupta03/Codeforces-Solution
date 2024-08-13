import java.util.Arrays;
import java.util.Scanner;

public class Boy_or_Girl{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int l = arr.length;
        int ans = 0;
        for (int i = 1; i < l; i++) {
            if (arr[i] != arr[i - 1])
                ans++;
        }

        if ((ans & 1) == 1)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}