package btvn_b1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (a[i] < a[j]) {
                    int x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
        System.out.println(a[0] + " " + a[1]);
    }
}
