import java.util.Random;
import java.util.Scanner;

public class RandGame {
    public static void main(String[] args) {
        System.out.println("Welcome to RandGame. What's your name?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        System.out.println("Hello, " + answer +  ". Shall we begin?");
        Scanner ask = new Scanner(System.in);
        String response = ask.next();
        if (response.equals("yes")) {
            System.out.println("Alright!");
        } else {
            System.out.println("Oh, okay. Later!");
            return;
        }

        Random random = new Random();
        int rand = random.nextInt(20) + 1;
        for (int i = 0; i < 5; i++) {
            System.out.println(answer + ", please provide a random number between 1 and 20.");
            Scanner begin = new Scanner(System.in);
            int end = begin.nextInt();
            System.out.println("You chose " + end);
            if (end > rand) {
                System.out.println("Hint: guess lower");
            } else if (end < rand) {
                System.out.println("Hint: guess higher");
            } else if (end == rand){
                System.out.println("Congratulations, you are correct!");
                System.out.println("The answer was " + rand + "!");
                System.out.println("thanks for playing, " + answer + "!");
                return;
            }
        }   System.out.println("Sorry " + answer+ ". the answer was " + rand + ". Game Over.");

    }
}