package kiemtraso;

import java.util.Scanner;

public class AllEvenDigits {

    public static boolean checkEvenDigits(int n) {

        while (n > 0) {

            int digit = n % 10;

            if (digit % 2 != 0) {
                return false;
            }

            n /= 10;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        if (checkEvenDigits(n)) {
            System.out.println("Toan chu so chan");
        } else {
            System.out.println("Khong phai toan chu so chan");
        }
    }
}