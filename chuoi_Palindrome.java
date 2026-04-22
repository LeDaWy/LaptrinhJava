package chuoiPalindrome;
import java.util.Scanner;
public class chuoi_Palindrome {
	public static boolean isPalindrome(String s) {
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Là chuỗi Palindrome");
        } else {
            System.out.println("Không phải Palindrome");
        }

        sc.close();
    }
}
