
package gamedoanso;
import java.util.Random;
import java.util.Scanner;
public class gmae_doan_so {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String playAgain;

        do {
            int secretNumber = rand.nextInt(101); // 0 -> 100
            int guess;
            int attempts = 0;
            boolean win = false;

            System.out.println("=== GAME ĐOÁN SỐ ===");

            while (attempts < 7) {
                System.out.print("Nhập số bạn đoán: ");
                guess = sc.nextInt();
                attempts++;

                if (guess == secretNumber) {
                    System.out.println("🎉 Bạn đã đoán đúng!");
                    win = true;
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Số bạn đoán NHỎ hơn!");
                } else {
                    System.out.println("Số bạn đoán LỚN hơn!");
                }

                System.out.println("Còn lại " + (7 - attempts) + " lần đoán.");
            }

            if (!win) {
                System.out.println("💀 Game Over! Số đúng là: " + secretNumber);
            }

            System.out.print("Bạn có muốn chơi lại không? (y/n): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("Cảm ơn bạn đã chơi!");
        sc.close();
    }
}
