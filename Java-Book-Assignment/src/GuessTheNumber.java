import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int randomNumber = new Random().nextInt(100) + 1;
        int guess;
        int count = 1;

        System.out.println("Guess a number between 1 to 100 :");
        guess = sc.nextInt();

        while(guess != randomNumber){
            if(guess > randomNumber)
                System.out.println("Guessed number is too high");
            else
                System.out.println("Guessed Number is too low");
            guess = sc.nextInt();
            count++;
        }
        System.out.println("You guessed correct number in "+ count + " chances");
    }
}
