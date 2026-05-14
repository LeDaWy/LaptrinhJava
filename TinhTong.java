package tinhtongso;

import java.util.Scanner;

public class TinhTong {

    public static long factorial(int n) {
        long gt = 1;

        for (int i = 1; i <= n; i++) {
            gt *= i;
        }

        return gt;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap x: ");
        int x = sc.nextInt();

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        double s = 0;

        for (int i = 0; i <= n; i++) {

            int mu = 2 * i + 1;

            s += Math.pow(x, mu) / factorial(mu);
        }

        System.out.println("S = " + s);
    }
}