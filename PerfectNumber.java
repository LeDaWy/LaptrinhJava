package pefectnummm;

import java.util.Scanner;

public class PerfectNumber {

    public static boolean isPerfect(int n) {

        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        if (isPerfect(n)) {
            System.out.println(n + " la so hoan thien");
        } else {
            System.out.println(n + " khong phai so hoan thien");
        }
    }
}
