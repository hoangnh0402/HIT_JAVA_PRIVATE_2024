package btvn_b1;
import java.util.Scanner;
public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i <= n; i++){
            a[i] = sc.nextInt();
        }
        int[] prefix = new int[n];
        prefix[0] = a[0];
        for(int i = 1; i < n; i++)
        {
            prefix[i] = a[i] + prefix[i-1];
        }
        int q = sc.nextInt();
        while(q != 0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(prefix[r] - prefix[l-1]);
            q--;
        }
    }
}
