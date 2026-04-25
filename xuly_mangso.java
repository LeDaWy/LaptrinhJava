package mangso;

public class xuly_mangso {
	 public static boolean isPrime(int n) {
	        if (n < 2) return false;
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) return false;
	        }
	        return true;
	    }

	    public static void main(String[] args) {

	        int[] arr = {3,6,7,8,11,17,2,90,2,5,4,5,8};

	        int countOdd = 0;
	        int countEven = 0;

	        System.out.print("Số lẻ: ");
	        for (int x : arr) {
	            if (x % 2 != 0) {
	                System.out.print(x + " ");
	                countOdd++;
	            }
	        }
	        System.out.println("=> " + countOdd + " số lẻ");

	        System.out.print("Số chẵn: ");
	        for (int x : arr) {
	            if (x % 2 == 0) {
	                System.out.print(x + " ");
	                countEven++;
	            }
	        }
	        System.out.println("=> " + countEven + " số chẵn");

	        System.out.print("Số nguyên tố: ");
	        for (int x : arr) {
	            if (isPrime(x)) {
	                System.out.print(x + " ");
	            }
	        }

	        System.out.print("\nKhông phải số nguyên tố: ");
	        for (int x : arr) {
	            if (!isPrime(x)) {
	                System.out.print(x + " ");
	            }
	        }
	    }
}
