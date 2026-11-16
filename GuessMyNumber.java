import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
	public static int guess;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("Guess a number between 1-100");
        guess = sc.nextInt();
        if (guess == number)
			System.out.println("You guessed correctly");
		else
			System.out.println("Your are off by " + Math.abs(number - guess) + ", I was thinking of " + number);
    }
}
