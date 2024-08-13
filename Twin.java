import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Twin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int sum = 0, sum1 = 0;
        ArrayList<Integer> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            arr.add(a[i]);
            sum += a[i];
        }
        Collections.sort(arr);
        for(int i=n-1; i>=0;i--){
            sum1+=arr.get(i);
            if(sum1>sum-sum1){
                System.out.println(n-i);
                break;
            }
        }
    }
}

