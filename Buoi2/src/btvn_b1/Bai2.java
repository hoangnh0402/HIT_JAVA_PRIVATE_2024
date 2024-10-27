package btvn_b1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap n=");
        int n = sc.nextInt();
        n = Math.abs(n);
        int p = 1;
        if (n == 0) {
            System.out.println(0);
            return;
        }
        while (n != 0) {
            int b = n % 10;
            p *= b;
            n /= 10;
        }
        System.out.println(" tich cua so:" + n + " la:" + p);
    }
}
